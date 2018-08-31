/**********************************************************************
* $Id: BootMain.java BootMain ,v0.1 2016年7月14日 上午11:30:06 DuanMinglei Exp $
* Copyright ©2016 yonyou . All rights reserved
***********************************************************************/
 
package com.cc.yonyou.rndealer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
* 功能说明：
* 创建者：段明磊
* E-mail: duanml1@yonyou.com
* 创建时间：2016年7月14日
* <pre>
* 修改时间:       修改者:            
* 修改内容：
* </pre>
* 版本：0.1
*/
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class BootMain{

	/**
	 * 功能说明    :
	 * 创建者         : 段明磊
	 * E-mail  : duanml1@yonyou.com
	 * 修改日期    : 2016年7月14日
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(BootMain.class, args);
	}

}
