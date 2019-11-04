package it.arsinfo.mtconnect;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConditionsController {
	
	@Autowired
	private MtConnectApiDao mtConnectApiDao;
    
    @RequestMapping("/conditions")
    public List<Condition> events(@RequestParam(value="name", defaultValue="World") String name) {
        return mtConnectApiDao.getConditions(name);
    }
}
