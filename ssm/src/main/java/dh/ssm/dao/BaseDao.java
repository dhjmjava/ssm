/**  
 * Project Name:ssm  
 * File Name:BaseDao.java  
 * Package Name:dh.ssm.dao  
 * Date:2017年7月27日上午11:55:27  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
*/  
  
package dh.ssm.dao;  

import java.util.List;

/**  
 * ClassName:BaseDao <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2017年7月27日 上午11:55:27 <br/>  
 * @author   daihui     
 * @since    JDK 1.7
 * @see        
 */
public interface BaseDao <T>{

	int save(T entity);
	
	int update(T entity);
	
	int delete(long id);
	
	T queryById(long id);
	
	List<T> queryAll();
	
}
  
