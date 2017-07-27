/**  
 * Project Name:ssm  
 * File Name:BaseService.java  
 * Package Name:dh.ssm.service  
 * Date:2017年7月27日下午12:07:32  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
*/  
  
package dh.ssm.service;  

import java.util.List;

/**  
 * ClassName:BaseService <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2017年7月27日 下午12:07:32 <br/>  
 * @author   daihui     
 * @since    JDK 1.7
 * @see        
 */
public interface BaseService <T> {
	
	List<T> queryAll();

}
  
