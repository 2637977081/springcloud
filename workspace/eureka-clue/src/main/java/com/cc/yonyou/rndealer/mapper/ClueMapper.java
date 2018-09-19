package com.cc.yonyou.rndealer.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClueMapper {
	public  List<Map<String,Object>> getClue();
}
