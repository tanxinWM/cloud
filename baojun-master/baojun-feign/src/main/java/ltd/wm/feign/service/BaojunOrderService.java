package ltd.wm.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ltd.wm.feign.hystric.FallbackOrderHystric;

@FeignClient(value = "order-model",fallback = FallbackOrderHystric.class)
public interface BaojunOrderService {

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name")String name);
}
