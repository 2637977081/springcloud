package com.cc.yonyou.rndealer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cc.yonyou.rndealer.service.UserServer;

@RestController
public class ClueController {
	
	@Autowired
	UserServer server ;
	
	@RequestMapping(value = "/getUserName", method = RequestMethod.GET)
	public String test() {
		return server.getUserName("123556");
	}
}
