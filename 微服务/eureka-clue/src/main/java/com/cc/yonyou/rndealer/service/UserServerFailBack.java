package com.cc.yonyou.rndealer.service;

import org.springframework.stereotype.Component;

/**
 * 熔断机制的处理
 * 
 * 当我调用User服务的方法，User返回异常时，处理返回异常的方法
 * @author liudongqiang
 *
 */
@Component
public class UserServerFailBack implements UserServer{

	@Override
	public String getUserName(String token) {
		// TODO Auto-generated method stub
		/**
		 * 当user服务发生异常，定义默认一个userNam进行返回
		 */
		String userName = "admin";
		
		return userName;
	}

}
