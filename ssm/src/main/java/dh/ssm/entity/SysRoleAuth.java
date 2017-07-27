/**  
 * Project Name:ssm  
 * File Name:SysRoleAuth.java  
 * Package Name:dh.ssm.entity  
 * Date:2017年7月27日下午3:39:06  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
*/  
  
package dh.ssm.entity;  

import java.io.Serializable;

/**  
 * ClassName:SysRoleAuth <br/>  
 * Function: 角色-权限 <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2017年7月27日 下午3:39:06 <br/>  
 * @author   daihui     
 * @since    JDK 1.7
 * @see        
 */
public class SysRoleAuth implements Serializable{
	 
	private static final long serialVersionUID = -1864447803219983595L;
	private long roleAuthId;
	private long roleId;
	private long authId;
	private long createTime;
	private String creatorGuid;
	private String creatorName;
	private long modifyTime;
	private String modifierGuid;
	private String modifierName;
	private Boolean isDeleted;
	public long getRoleAuthId() {
		return roleAuthId;
	}
	public void setRoleAuthId(long roleAuthId) {
		this.roleAuthId = roleAuthId;
	}
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public long getAuthId() {
		return authId;
	}
	public void setAuthId(long authId) {
		this.authId = authId;
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
	

}
  
