/**  
 * Project Name:ssm  
 * File Name:SysUser.java  
 * Package Name:dh.ssm.entity  
 * Date:2017年7月27日下午3:39:39  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
*/  
  
package dh.ssm.entity;  

import java.io.Serializable;

/**  
 * ClassName:SysUser <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2017年7月27日 下午3:39:39 <br/>  
 * @author   daihui     
 * @since    JDK 1.7
 * @see        
 */
public class SysUser implements Serializable{
	
	/**  
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
	 * @since JDK 1.7  
	 */
	 
	private static final long serialVersionUID = 7020725499293857739L;
	private long id;
	private String name;
	private String passWord;
	private String userName;
	private Boolean state;
	private long createTime;
	private String creatorGuid;
	private String creatorName;
	private long modifyTime;
	private String modifierGuid;
	private String modifierName;
	private Boolean isDeleted;
	
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
		return this.userName;
	}
	public Boolean getState() {
		return state;
	}
	public void setState(Boolean state) {
		this.state = state;
	}
	public long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}
	public String getCreatorGuid() {
		return creatorGuid;
	}
	public void setCreatorGuid(String creatorGuid) {
		this.creatorGuid = creatorGuid;
	}
	public String getCreatorName() {
		return creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}
	public long getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(long modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getModifierGuid() {
		return modifierGuid;
	}
	public void setModifierGuid(String modifierGuid) {
		this.modifierGuid = modifierGuid;
	}
	public String getModifierName() {
		return modifierName;
	}
	public void setModifierName(String modifierName) {
		this.modifierName = modifierName;
	}
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
  
