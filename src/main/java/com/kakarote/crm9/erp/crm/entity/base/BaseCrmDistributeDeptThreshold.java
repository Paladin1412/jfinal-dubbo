package com.kakarote.crm9.erp.crm.entity.base;

import com.jfinal.plugin.activerecord.CrmModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCrmDistributeDeptThreshold<M extends BaseCrmDistributeDeptThreshold<M>> extends CrmModel<M> implements IBean {

	public M setId(java.math.BigInteger id) {
		set("id", id);
		return (M)this;
	}
	
	public java.math.BigInteger getId() {
		return get("id");
	}

	public M setResourceType(Integer resourceType) {
		set("resource_type", resourceType);
		return (M)this;
	}
	
	public Integer getResourceType() {
		return getInt("resource_type");
	}

	public M setDeptId(Integer deptId) {
		set("dept_id", deptId);
		return (M)this;
	}
	
	public Integer getDeptId() {
		return getInt("dept_id");
	}

	public M setCountMode(Integer countMode) {
		set("count_mode", countMode);
		return (M)this;
	}
	
	public Integer getCountMode() {
		return getInt("count_mode");
	}

	public M setThreshold(Integer threshold) {
		set("threshold", threshold);
		return (M)this;
	}
	
	public Integer getThreshold() {
		return getInt("threshold");
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

	public M setIsDeleted(Integer isDeleted) {
		set("is_deleted", isDeleted);
		return (M)this;
	}
	
	public Integer getIsDeleted() {
		return getInt("is_deleted");
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