/**  
 * Project Name:ssm  
 * File Name:U.java  
 * Package Name:dh.ssm.service.impl  
 * Date:2017年7月27日上午11:44:47  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
*/  
  
package dh.ssm.service.impl;  

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dh.ssm.dao.SysUserDao;
import dh.ssm.entity.SysUser;
import dh.ssm.service.SysUserService;

/**  
 * ClassName:U <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2017年7月27日 上午11:44:47 <br/>  
 * @author   daihui     
 * @since    JDK 1.7
 * @see        
 */
@Service
public class SysUserServiceImpl implements SysUserService{

	@Autowired
	private SysUserDao sysUserDao;
	
	@Override
	public List<SysUser> queryAll() {
		return sysUserDao.queryAll();
	}

	@Override
	public SysUser findByUsername(String userName) {
		return sysUserDao.findByUsername(userName);
	}

}
  
