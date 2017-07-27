/**  
 * Project Name:ssm  
 * File Name:UserInfo.java  
 * Package Name:dh.ssm.entity  
 * Date:2017年7月27日上午11:40:31  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
*/  
  
package dh.ssm.entity;  

import java.io.Serializable;

/**  
 * ClassName:UserInfo <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2017年7月27日 上午11:40:31 <br/>  
 * @author   daihui     
 * @since    JDK 1.7
 * @see        
 */
public class UserInfo implements Serializable{

	private static final long serialVersionUID = 7049894474235416218L;
	
	private long id;
	private String name;
	private String passWord;
	private String userName;
	private String salt;
	private Boolean state;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public Boolean getState() {
		return state;
	}
	public void setState(Boolean state) {
		this.state = state;
	}
	
}
  
