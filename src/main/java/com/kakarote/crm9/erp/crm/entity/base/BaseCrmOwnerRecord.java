package com.kakarote.crm9.erp.crm.entity.base;

import com.jfinal.plugin.activerecord.CrmModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCrmOwnerRecord<M extends BaseCrmOwnerRecord<M>> extends CrmModel<M> implements IBean {

	public M setRecordId(Long recordId) {
		set("record_id", recordId);
		return (M)this;
	}

	public Long getRecordId() {
		return getLong("record_id");
	}

	public M setTypeId(Integer typeId) {
		set("type_id", typeId);
		return (M)this;
	}

	public Integer getTypeId() {
		return getInt("type_id");
	}

	public M setType(Integer type) {
		set("type", type);
		return (M)this;
	}

	public Integer getType() {
		return getInt("type");
	}

	public M setPreOwnerUserId(Integer preOwnerUserId) {
		set("pre_owner_user_id", preOwnerUserId);
		return (M)this;
	}

	public Integer getPreOwnerUserId() {
		return getInt("pre_owner_user_id");
	}

	public M setPostOwnerUserId(Integer postOwnerUserId) {
		set("post_owner_user_id", postOwnerUserId);
		return (M)this;
	}

	public Integer getPostOwnerUserId() {
		return getInt("post_owner_user_id");
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