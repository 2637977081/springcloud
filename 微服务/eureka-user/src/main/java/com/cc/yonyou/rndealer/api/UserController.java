package com.cc.yonyou.rndealer.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "Hello Word !";
	}
}
