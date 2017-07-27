/**  
 * Project Name:ssm  
 * File Name:SysRole.java  
 * Package Name:dh.ssm.entity  
 * Date:2017年7月27日下午3:37:59  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
*/  
  
package dh.ssm.entity;  

import java.io.Serializable;

/**  
 * ClassName:SysRole <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2017年7月27日 下午3:37:59 <br/>  
 * @author   daihui     
 * @since    JDK 1.7
 * @see        
 */
public class SysRole implements Serializable{
	
	/**  
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
	 * @since JDK 1.7  
	 */
	 
	private static final long serialVersionUID = -4834087512748102076L;
	
	private long roleId;
	private String roleName;
	private String describe;
	private long createTime;
	private String creatorGuid;
	private String creatorName;
	private long modifyTime;
	private String modifierGuid;
	private String modifierName;
	private Boolean isDeleted;
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
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
  
