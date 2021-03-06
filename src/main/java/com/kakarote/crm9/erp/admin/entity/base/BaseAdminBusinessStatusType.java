package com.kakarote.crm9.erp.admin.entity.base;

import com.jfinal.plugin.activerecord.CrmModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseAdminBusinessStatusType<M extends BaseAdminBusinessStatusType<M>> extends CrmModel<M> implements IBean {

	public M setId(Long id) {
		set("id", id);
		return (M)this;
	}

	public Long getId() {
		return getLong("id");
	}

	public M setStatusTypeName(String statusTypeName) {
		set("status_type_name", statusTypeName);
		return (M)this;
	}

	public String getStatusTypeName() {
		return getStr("status_type_name");
	}

	public M setWinRateValue(String winRateValue) {
		set("win_rate_value", winRateValue);
		return (M)this;
	}

	public String getWinRateValue() {
		return getStr("win_rate_value");
	}

	public M setCreateUser(Long createUser) {
		set("create_user", createUser);
		return (M)this;
	}

	public Long getCreateUser() {
		return getLong("create_user");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public M setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
		return (M)this;
	}

	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	public M setIsDelete(Integer isDelete) {
		set("is_delete", isDelete);
		return (M)this;
	}

	public Integer getIsDelete() {
		return getInt("is_delete");
	}

}
