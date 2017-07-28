/**  
 * Project Name:ssm  
 * File Name:UserInfoService.java  
 * Package Name:dh.ssm.service  
 * Date:2017年7月27日上午11:45:44  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
*/  
  
package dh.ssm.service;  

import dh.ssm.dao.SysUserDao;
import dh.ssm.entity.SysUser;

/**  
 * ClassName:UserInfoService <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2017年7月27日 上午11:45:44 <br/>  
 * @author   daihui     
 * @since    JDK 1.7
 * @see        
 */
public interface SysUserService extends BaseService<SysUser>{
	
	SysUser findByUsername(String userName);

}
  
