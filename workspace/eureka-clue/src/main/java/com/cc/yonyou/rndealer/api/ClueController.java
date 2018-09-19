package com.cc.yonyou.rndealer.api;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cc.yonyou.rndealer.po.BaseJSON;
import com.cc.yonyou.rndealer.service.ClueService;
import com.cc.yonyou.rndealer.service.UserServer;

@RestController
public class ClueController {
	
	@Autowired
	UserServer server ;
	
	@Autowired
	public ClueService clueService; 
	
	@RequestMapping(value = "/getUserName", method = RequestMethod.GET)
	public String test() {
		return server.getUserName("123556");
	}
	
	@RequestMapping(value = "/getClueList", method = RequestMethod.GET)
	public BaseJSON getClueList(){
		BaseJSON json = new BaseJSON();
		List<Map<String,Object>> list = clueService.getClue();
		if(list.size()>0){
			json.setResult(list);
		}
		return json;
	}
}
