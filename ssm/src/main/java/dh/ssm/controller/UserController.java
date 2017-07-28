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

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dh.ssm.entity.SysUser;
import dh.ssm.service.SysUserService;

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
	private SysUserService sysUserService;
	
	@RequestMapping("/hello")
	@ResponseBody
	public List<SysUser> hello(){
		List<SysUser> list = sysUserService.queryAll();
		return list;
	}
	
	@RequestMapping("/")
	@ResponseBody
	public String index(){
		return "hellohello";
	}
	
	/**
	 * 
	 * login:进行登录验证. <br/>   
	 *   
	 * @param username
	 * @param password
	 * @return  
	 * @author daihui
	 * Date:2017年6月15日下午8:17:01
	 */
	@RequestMapping(value = "/dologin", method = RequestMethod.POST)
	@ResponseBody
    public String login(@RequestParam("username") String username,@RequestParam("password") String password) {  
        
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        token.setRememberMe(true);
        String msg = "";
        //未验证则进行登录
        if(!subject.isAuthenticated()){
        	try {
        		
        		subject.login(token);
        		
			} catch (UnknownAccountException e) {
				System.out.println("UnknownAccountException -->帐号不存在：");  
                msg = "帐号不存在！";  
			} catch (IncorrectCredentialsException e){
				System.out.println("IncorrectCredentialsException -- > 密码不正确：");  
                msg = "用户名或密码不正确！";
			} catch(LockedAccountException e){
				System.out.println("LockedAccountException -- > 账号已被锁定：");  
				msg = "账号已被锁定，请联系管理员！";
			} catch (Exception e){
				e.printStackTrace();
				msg = "登录失败！！";
			}
        	
        }
        System.out.println("sessionId:"+subject.getSession().getId());
        // 此方法不处理登录成功,由shiro进行处理.  
        return msg;  
    }  

}
  
