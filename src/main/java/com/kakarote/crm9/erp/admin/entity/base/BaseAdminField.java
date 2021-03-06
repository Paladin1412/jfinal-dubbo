package com.kakarote.crm9.erp.admin.entity.base;

import com.jfinal.plugin.activerecord.CrmModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseAdminField<M extends BaseAdminField<M>> extends CrmModel<M> implements IBean {

	public M setFieldId(Long fieldId) {
		set("field_id", fieldId);
		return (M)this;
	}

	public Long getFieldId() {
		return getLong("field_id");
	}

	public M setParentId(Integer parentId) {
		set("parent_id", parentId);
		return (M)this;
	}

	public Integer getParentId() {
		return getInt("parent_id");
	}

	public M setFieldName(String fieldName) {
		set("field_name", fieldName);
		return (M)this;
	}

	public String getFieldName() {
		return getStr("field_name");
	}

	public M setName(String name) {
		set("name", name);
		return (M)this;
	}

	public String getName() {
		return getStr("name");
	}

	public M setType(Integer type) {
		set("type", type);
		return (M)this;
	}

	public Integer getType() {
		return getInt("type");
	}

	public M setLabel(Integer label) {
		set("label", label);
		return (M)this;
	}

	public Integer getLabel() {
		return getInt("label");
	}

	public M setRemark(String remark) {
		set("remark", remark);
		return (M)this;
	}

	public String getRemark() {
		return getStr("remark");
	}

	public M setInputTips(String inputTips) {
		set("input_tips", inputTips);
		return (M)this;
	}

	public String getInputTips() {
		return getStr("input_tips");
	}

	public M setMaxLength(Integer maxLength) {
		set("max_length", maxLength);
		return (M)this;
	}

	public Integer getMaxLength() {
		return getInt("max_length");
	}

	public M setDefaultValue(String defaultValue) {
		set("default_value", defaultValue);
		return (M)this;
	}

	public String getDefaultValue() {
		return getStr("default_value");
	}

	public M setIsUnique(Integer isUnique) {
		set("is_unique", isUnique);
		return (M)this;
	}

	public Integer getIsUnique() {
		return getInt("is_unique");
	}

	public M setIsNull(Integer isNull) {
		set("is_null", isNull);
		return (M)this;
	}

	public Integer getIsNull() {
		return getInt("is_null");
	}

	public M setSorting(Integer sorting) {
		set("sorting", sorting);
		return (M)this;
	}

	public Integer getSorting() {
		return getInt("sorting");
	}

	public M setOptions(String options) {
		set("options", options);
		return (M)this;
	}

	public String getOptions() {
		return getStr("options");
	}

	public M setValue(String value) {
		set("value", value);
		return (M)this;
	}

	public String getValue() {
		return getStr("value");
	}

	public M setOperating(Integer operating) {
		set("operating", operating);
		return (M)this;
	}

	public Integer getOperating() {
		return getInt("operating");
	}

	public M setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
		return (M)this;
	}

	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	public M setBatchId(String batchId) {
		set("batch_id", batchId);
		return (M)this;
	}

	public String getBatchId() {
		return getStr("batch_id");
	}

	public M setExamineCategoryId(Long examineCategoryId) {
		set("examine_category_id", examineCategoryId);
		return (M)this;
	}

	public Long getExamineCategoryId() {
		return getLong("examine_category_id");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
