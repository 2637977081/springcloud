package com.cc.yonyou.rndealer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 服务间调用接口
 * @author liudongqiang
 *
 */

@FeignClient(value="user", fallback=UserServerFailBack.class)
public interface UserServer {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String getUserName(@RequestParam(value="token")String token);
}
