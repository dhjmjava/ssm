/**  
 * Project Name:ssm  
 * File Name:UserInfoDao.java  
 * Package Name:dh.ssm.dao  
 * Date:2017年7月27日上午11:47:42  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
*/  
  
package dh.ssm.dao;  

import dh.ssm.entity.SysUser;

/**  
 * ClassName:UserInfoDao <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2017年7月27日 上午11:47:42 <br/>  
 * @author   daihui     
 * @since    JDK 1.7
 * @see        
 */
public interface SysUserDao extends BaseDao<SysUser>{
	
	SysUser findByUsername(String userName);

}
  
