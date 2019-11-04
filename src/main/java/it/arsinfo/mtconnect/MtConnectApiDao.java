package it.arsinfo.mtconnect;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import it.arsinfo.mtconnect.streams.AvailabilityType;
import it.arsinfo.mtconnect.streams.MTConnectStreamsType;



@Service
public class MtConnectApiDao {
	
	
    private final AtomicLong counter = new AtomicLong();
    private static final Logger log = LoggerFactory.getLogger(MtConnectApiDao.class);

	@Autowired
	private RestTemplate restTemplate;

	public List<Event> getEvents(String name) {
		final List<Event> events = new ArrayList<>();
		MTConnectStreamsType quote = restTemplate.getForObject(
				"https://smstestbed.nist.gov/vds/current", MTConnectStreamsType.class);
		log.info("headerVersion: {}",quote.getHeader().getVersion());
		log.info("headerVersionId: {}",quote.getHeader().getInstanceId());
		log.info("nextSequence: {}",quote.getHeader().getNextSequence());
		quote.getStreams().getDeviceStream().forEach( devStream -> {
			log.info("{} {}", devStream.getName(), devStream.getUuid());
			devStream.getComponentStream().stream()
				.filter(cs -> cs.getEvents() != null)
				.forEach(cs -> {
					log.info("{}: {} {} {} ", 
						devStream.getName(),
						cs.getName(), 
						cs.getUuid(),
						cs.getComponent()
					);
					cs.getEvents().getEvent().stream()
					.filter(e -> e!= null)
					.forEach(e -> {
						log.info("events: {}: {}: {}", 
							devStream.getName(),
							cs.getName(), 
							e.getName().getNamespaceURI()
						);
						if (e.getValue() != null && "avail".equals(e.getValue().getName())) {
							AvailabilityType avail = (AvailabilityType) e.getValue();
							events.add(new Event(
									avail.getSequence().longValue(),devStream.getName(),
									cs.getName(),
									avail.getValue()));
							} else {
							events.add(new Event(counter.incrementAndGet(),
									devStream.getName(),
									cs.getName(),
								e.getValue().getName()));
						}
				});
			});
		
		});

		return events;
	}
}
