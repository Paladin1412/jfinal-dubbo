package com.kakarote.crm9.erp.admin.entity.base;

import com.jfinal.plugin.activerecord.CrmModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseAdminCustomerReceiveRole<M extends BaseAdminCustomerReceiveRole<M>> extends CrmModel<M> implements IBean {

	public M setId(java.math.BigInteger id) {
		set("id", id);
		return (M)this;
	}
	
	public java.math.BigInteger getId() {
		return get("id");
	}

	public M setDeptId(Long deptId) {
		set("dept_id", deptId);
		return (M)this;
	}
	
	public Long getDeptId() {
		return getLong("dept_id");
	}

	public M setIsNeedCheck(Integer isNeedCheck) {
		set("is_need_check", isNeedCheck);
		return (M)this;
	}
	
	public Integer getIsNeedCheck() {
		return getInt("is_need_check");
	}

	public M setMoney(java.math.BigDecimal money) {
		set("money", money);
		return (M)this;
	}
	
	public java.math.BigDecimal getMoney() {
		return get("money");
	}

	public M setIsDeleted(Integer isDeleted) {
		set("is_deleted", isDeleted);
		return (M)this;
	}
	
	public Integer getIsDeleted() {
		return getInt("is_deleted");
	}

	public M setGmtCreate(java.util.Date gmtCreate) {
		set("gmt_create", gmtCreate);
		return (M)this;
	}
	
	public java.util.Date getGmtCreate() {
		return get("gmt_create");
	}

	public M setGmtModified(java.util.Date gmtModified) {
		set("gmt_modified", gmtModified);
		return (M)this;
	}
	
	public java.util.Date getGmtModified() {
		return get("gmt_modified");
	}

	public M setEnvFlag(String envFlag) {
		set("env_flag", envFlag);
		return (M)this;
	}
	
	public String getEnvFlag() {
		return getStr("env_flag");
	}

	public M setRemark(String remark) {
		set("remark", remark);
		return (M)this;
	}
	
	public String getRemark() {
		return getStr("remark");
	}

}
