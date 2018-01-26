package ltd.wm.feign.hystric;

import org.springframework.stereotype.Component;

import ltd.wm.feign.service.BaojunOrderService;

@Component
public class FallbackOrderHystric implements BaojunOrderService {

	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry," + name + "server,error";
	}

}
