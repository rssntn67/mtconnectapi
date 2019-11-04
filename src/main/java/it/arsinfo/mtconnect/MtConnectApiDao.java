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
import it.arsinfo.mtconnect.streams.EmergencyStopType;
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
		quote.getStreams().getDeviceStream().forEach( devStream -> {
			devStream.getComponentStream().stream()
				.filter(cs -> cs.getEvents() != null)
				.forEach(cs -> {
					cs.getEvents().getEvent().stream()
					.filter(e -> e!= null)
					.forEach(e -> {
						if (e.getValue() != null && "avail".equals(e.getValue().getName())) {
							AvailabilityType avail = (AvailabilityType) e.getValue();
							events.add(new Event(
									avail.getSequence().longValue(),devStream.getName(),
									cs.getName(),"Availability",
									avail.getValue()));
						} else if (e.getValue() != null && "estop".equals(e.getValue().getName())) {
							EmergencyStopType estop = (EmergencyStopType) e.getValue();
							events.add(new Event(
									estop.getSequence().longValue(),devStream.getName(),
									cs.getName(),"EmergencyStop",
									estop.getValue()));
							} else {
							events.add(new Event(counter.incrementAndGet(),
									devStream.getName(),
									cs.getName(),
									e.getClass().toString(),
								e.getValue().getName()));
						}
				});
			});
			events.forEach(eve -> log.info(eve.toString()));
		
		});

		return events;
	}
}
