package com.cc.yonyou.rndealer.service.imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.yonyou.rndealer.service.ClueService;
import com.cc.yonyou.rndealer.mapper.ClueMapper;

@Service
public class ClueServiceImp implements ClueService{
	
	@Autowired
	private ClueMapper ClueMapper;
	
	@Override
	public List<Map<String, Object>> getClue() {
		List<Map<String,Object>> list = ClueMapper.getClue();
		return list;
	}


}
