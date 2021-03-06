package com.kakarote.crm9.erp.crm.entity.base;

import com.jfinal.plugin.activerecord.CrmModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCrmContractProduct<M extends BaseCrmContractProduct<M>> extends CrmModel<M> implements IBean {

	/**
	 * 主键id
	 */
	public M setId(java.math.BigInteger id) {
		set("id", id);
		return (M)this;
	}
	
	/**
	 * 主键id
	 */
	public java.math.BigInteger getId() {
		return get("id");
	}

	/**
	 * 合同ID
	 */
	public M setContractId(java.math.BigInteger contractId) {
		set("contract_id", contractId);
		return (M)this;
	}
	
	/**
	 * 合同ID
	 */
	public java.math.BigInteger getContractId() {
		return get("contract_id");
	}

	/**
	 * 产品ID
	 */
	public M setProductId(Long productId) {
		set("product_id", productId);
		return (M)this;
	}
	
	/**
	 * 产品ID
	 */
	public Long getProductId() {
		return getLong("product_id");
	}

	/**
	 * 数量
	 */
	public M setNum(Integer num) {
		set("num", num);
		return (M)this;
	}
	
	/**
	 * 数量
	 */
	public Integer getNum() {
		return getInt("num");
	}

	/**
	 * 销售金额
	 */
	public M setSalesMoney(java.math.BigDecimal salesMoney) {
		set("sales_money", salesMoney);
		return (M)this;
	}
	
	/**
	 * 销售金额
	 */
	public java.math.BigDecimal getSalesMoney() {
		return get("sales_money");
	}

	/**
	 * 单位：1 CNY
	 */
	public M setUnit(Integer unit) {
		set("unit", unit);
		return (M)this;
	}
	
	/**
	 * 单位：1 CNY
	 */
	public Integer getUnit() {
		return getInt("unit");
	}

	/**
	 * 创建时间
	 */
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}
	
	/**
	 * 创建时间
	 */
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	/**
	 * 创建时间
	 */
	public M setGmtCreate(java.util.Date gmtCreate) {
		set("gmt_create", gmtCreate);
		return (M)this;
	}
	
	/**
	 * 创建时间
	 */
	public java.util.Date getGmtCreate() {
		return get("gmt_create");
	}

	/**
	 * 修改时间
	 */
	public M setGmtModified(java.util.Date gmtModified) {
		set("gmt_modified", gmtModified);
		return (M)this;
	}
	
	/**
	 * 修改时间
	 */
	public java.util.Date getGmtModified() {
		return get("gmt_modified");
	}

	/**
	 * 0: 未删除 1:已删除
	 */
	public M setIsDeleted(Integer isDeleted) {
		set("is_deleted", isDeleted);
		return (M)this;
	}
	
	/**
	 * 0: 未删除 1:已删除
	 */
	public Integer getIsDeleted() {
		return getInt("is_deleted");
	}

	/**
	 * 环境标
	 */
	public M setEnvFlag(String envFlag) {
		set("env_flag", envFlag);
		return (M)this;
	}
	
	/**
	 * 环境标
	 */
	public String getEnvFlag() {
		return getStr("env_flag");
	}

	/**
	 * 备注
	 */
	public M setRemark(String remark) {
		set("remark", remark);
		return (M)this;
	}
	
	/**
	 * 备注
	 */
	public String getRemark() {
		return getStr("remark");
	}

}
