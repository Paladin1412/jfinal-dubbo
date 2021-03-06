package com.kakarote.crm9.erp.crm.entity.base;

import com.jfinal.plugin.activerecord.CrmModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCrmSignInHistory<M extends BaseCrmSignInHistory<M>> extends CrmModel<M> implements IBean {

	public M setId(java.math.BigInteger id) {
		set("id", id);
		return (M)this;
	}

	public java.math.BigInteger getId() {
		return get("id");
	}

	public M setHistoryId(java.lang.String historyId) {
		set("history_id", historyId);
		return (M)this;
	}

	public java.lang.String getHistoryId() {
		return getStr("history_id");
	}

	public M setCustomerAddressId(java.lang.String customerAddressId) {
		set("customer_address_id", customerAddressId);
		return (M)this;
	}

	public java.lang.String getCustomerAddressId() {
		return getStr("customer_address_id");
	}

	public M setSignInTime(java.util.Date signInTime) {
		set("sign_in_time", signInTime);
		return (M)this;
	}

	public java.util.Date getSignInTime() {
		return get("sign_in_time");
	}

	public M setSignUserId(java.lang.Integer signUserId) {
		set("sign_user_id", signUserId);
		return (M)this;
	}

	public java.lang.Integer getSignUserId() {
		return getInt("sign_user_id");
	}

	public M setAdminRecordId(java.lang.Integer adminRecordId) {
		set("admin_record_id", adminRecordId);
		return (M)this;
	}

	public java.lang.Integer getAdminRecordId() {
		return getInt("admin_record_id");
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

	public M setIsDeleted(java.lang.Integer isDeleted) {
		set("is_deleted", isDeleted);
		return (M)this;
	}

	public java.lang.Integer getIsDeleted() {
		return getInt("is_deleted");
	}

	public M setEnvFlag(java.lang.String envFlag) {
		set("env_flag", envFlag);
		return (M)this;
	}

	public java.lang.String getEnvFlag() {
		return getStr("env_flag");
	}

	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}

	public java.lang.String getRemark() {
		return getStr("remark");
	}

	public M setAuthUserId(java.lang.Integer authUserId) {
		set("auth_user_id", authUserId);
		return (M)this;
	}

	public java.lang.Integer getAuthUserId() {
		return getInt("auth_user_id");
	}

	public M setAuthDeptId(java.lang.Integer authDeptId) {
		set("auth_dept_id", authDeptId);
		return (M)this;
	}

	public java.lang.Integer getAuthDeptId() {
		return getInt("auth_dept_id");
	}

}
