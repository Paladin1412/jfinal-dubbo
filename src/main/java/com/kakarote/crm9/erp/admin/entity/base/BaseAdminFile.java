package com.kakarote.crm9.erp.admin.entity.base;

import com.jfinal.plugin.activerecord.CrmModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseAdminFile<M extends BaseAdminFile<M>> extends CrmModel<M> implements IBean {

	public M setFileId(Long fileId) {
		set("file_id", fileId);
		return (M)this;
	}

	public Long getFileId() {
		return getLong("file_id");
	}

	public M setName(String name) {
		set("name", name);
		return (M)this;
	}

	public String getName() {
		return getStr("name");
	}

	public M setSize(Integer size) {
		set("size", size);
		return (M)this;
	}

	public Integer getSize() {
		return getInt("size");
	}

	public M setCreateUserId(Integer createUserId) {
		set("create_user_id", createUserId);
		return (M)this;
	}

	public Integer getCreateUserId() {
		return getInt("create_user_id");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public M setPath(String path) {
		set("path", path);
		return (M)this;
	}

	public String getPath() {
		return getStr("path");
	}

	public M setFilePath(String filePath) {
		set("file_path", filePath);
		return (M)this;
	}

	public String getFilePath() {
		return getStr("file_path");
	}

	public M setFileType(String fileType) {
		set("file_type", fileType);
		return (M)this;
	}

	public String getFileType() {
		return getStr("file_type");
	}

	public M setBatchId(String batchId) {
		set("batch_id", batchId);
		return (M)this;
	}

	public String getBatchId() {
		return getStr("batch_id");
	}

	public M setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
		return (M)this;
	}

	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

}
