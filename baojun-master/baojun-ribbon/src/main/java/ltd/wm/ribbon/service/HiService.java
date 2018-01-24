package ltd.wm.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HiService {
	
	@Autowired
	RestTemplate restTemplate;
	
	public String hiService(String name){
		return restTemplate.getForObject("http://order-model/hi?name="+name, String.class);
	}
}
