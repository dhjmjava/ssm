/**  
 * Project Name:ssm  
 * File Name:SysUserRole.java  
 * Package Name:dh.ssm.entity  
 * Date:2017年7月27日下午3:38:42  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
*/  
  
package dh.ssm.entity;  

import java.io.Serializable;

/**  
 * ClassName:SysUserRole <br/>  
 * Function: 用户-角色. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2017年7月27日 下午3:38:42 <br/>  
 * @author   daihui     
 * @since    JDK 1.7
 * @see        
 */
public class SysUserRole implements Serializable{
	
	/**  
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
	 * @since JDK 1.7  
	 */
	 
	private static final long serialVersionUID = -3536808942519317910L;
	private long userRoleId;
	private long userId;
	private long roleId;
	private long createTime;
	private String creatorGuid;
	private String creatorName;
	private long modifyTime;
	private String modifierGuid;
	private String modifierName;
	private Boolean isDeleted;
	
	public long getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(long userRoleId) {
		this.userRoleId = userRoleId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
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
  
