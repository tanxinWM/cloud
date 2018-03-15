package ltd.wm.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

<<<<<<< HEAD
import ltd.wm.feign.hystric.FallbackOrderHystric;

@FeignClient(value = "order-model",fallback = FallbackOrderHystric.class)
=======
@FeignClient(value = "order-model")
>>>>>>> 3761f75c1404cbc3f63072329e25c20ae3dbad8b
public interface BaojunOrderService {

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name")String name);
}
