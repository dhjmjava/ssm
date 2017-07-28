/**  
 * Project Name:ssm  
 * File Name:ShiroRealm.java  
 * Package Name:dh.ssm.realm  
 * Date:2017年7月28日下午3:14:59  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
*/  
  
package dh.ssm.realm;  

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import dh.ssm.entity.SysUser;
import dh.ssm.service.SysUserService;

/**  
 * ClassName:ShiroRealm <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2017年7月28日 下午3:14:59 <br/>  
 * @author   daihui     
 * @since    JDK 1.7
 * @see        
 */
public class ShiroRealm extends AuthorizingRealm{
	
	@Autowired
	private SysUserService sysUserService;
	
	/**  
     * 认证信息(身份验证) 
     * Authentication 是用来验证用户身份  
     */  
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		  
		// 获取用户的输入帐号  
    	UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token; 
        String username = usernamePasswordToken.getUsername();  
        // 通过username从数据库中查找 User对象  
        SysUser userInfo = sysUserService.findByUsername(username);  
        if (userInfo == null) {  
            throw new UnknownAccountException("账号不存在！！"); 
        }  
  
        //密码比对
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
        		userInfo.getUserName(), // 用户名  
        		userInfo.getPassWord(), // 密码  
                ByteSource.Util.bytes(userInfo.getSalt()), // salt=username 
                getName() // realm name  
        );  
        return authenticationInfo; 
		
	}  

    /**
     * 此方法用于授权.  
     * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
     */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		System.out.println("权限配置-->ShiroRealm.doGetAuthorizationInfo()");  
        String username = (String)principals.getPrimaryPrincipal();
        // UserInfo userInfo = userInfoService.findByUsername(username);  
          
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        /*for(SysRole role:userInfo.getRoleList()){  
               authorizationInfo.addRole(role.getRole());  
               System.out.println(role.getPermissions());  
               for(SysPermission p:role.getPermissions()){  
                   System.out.println(p);  
                  authorizationInfo.addStringPermission(p.getPermission());  
               }  
           } */
        return authorizationInfo; 
		
	}

}
  
