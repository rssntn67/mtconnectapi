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

	private MTConnectStreamsType get() {
		return restTemplate.getForObject(
				"https://smstestbed.nist.gov/vds/current", MTConnectStreamsType.class);		
	}
	public List<Event> getEvents(String name) {
		final List<Event> events = new ArrayList<>();
		get().getStreams().getDeviceStream().forEach( devStream -> {
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

	public List<Condition> getConditions(String name) {
		final List<Condition> conditions = new ArrayList<>();
		get().getStreams().getDeviceStream().forEach( devStream -> {
			devStream.getComponentStream().stream()
				.filter(cs -> cs.getCondition() != null)
				.forEach(cs -> {
					cs.getCondition().getCondition().stream()
					.filter(c -> c!= null)
					.forEach(e -> {
						conditions.add(new Condition(counter.incrementAndGet(),
									devStream.getName(),
									cs.getName(),
									e.getClass().toString(),
									e.getValue().getType(),
								e.getValue().getName()));
				});
			});
			conditions.forEach(eve -> log.info(eve.toString()));
		
		});
		return conditions;
	}
}
