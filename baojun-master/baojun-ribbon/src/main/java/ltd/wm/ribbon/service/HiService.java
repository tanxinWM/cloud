package ltd.wm.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HiService {
	
	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="hiError")
	public String hiService(String name){
		return restTemplate.getForObject("http://ORDER-MODEL/hi?name="+name, String.class);
	}
	
	public String hiError(String name) {
		return "hi" +name + ",sorry,server error!";
	}
}
