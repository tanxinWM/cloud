package ltd.wm.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ltd.wm.feign.service.BaojunOrderService;

@RestController
public class BaojunOrderController {

	@Autowired
	private BaojunOrderService service;

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String sayHi(String name) {
		return service.sayHiFromClientOne(name);
	}
}
