package it.arsinfo.mtconnect;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventsController {
	
	@Autowired
	private MtConnectApiDao mtConnectApiDao;
    
    @RequestMapping("/events")
    public List<Event> events(@RequestParam(value="name", defaultValue="World") String name) {
        return mtConnectApiDao.getEvents(name);
    }
}
