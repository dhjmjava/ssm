/**  
 * Project Name:ssm  
 * File Name:UserController.java  
 * Package Name:dh.ssm.controller  
 * Date:2017年7月26日下午4:30:00  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
*/  
  
package dh.ssm.controller;  

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dh.ssm.entity.UserInfo;
import dh.ssm.service.UserInfoService;

/**  
 * ClassName:UserController <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2017年7月26日 下午4:30:00 <br/>  
 * @author   daihui     
 * @since    JDK 1.7
 * @see        
 */
@Controller
public class UserController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping("/hello")
	@ResponseBody
	public List<UserInfo> hello(){
		List<UserInfo> list = userInfoService.queryAll();
		return list;
	}
	
	@RequestMapping("/")
	@ResponseBody
	public String index(){
		return "hellohello";
	}

}
  
