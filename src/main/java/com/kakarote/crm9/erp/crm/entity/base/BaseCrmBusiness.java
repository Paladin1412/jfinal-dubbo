package com.kakarote.crm9.erp.crm.entity.base;

import com.jfinal.plugin.activerecord.CrmModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCrmBusiness<M extends BaseCrmBusiness<M>> extends CrmModel<M> implements IBean {

	public M setBusinessId(Long businessId) {
		set("business_id", businessId);
		return (M)this;
	}
	
	public Long getBusinessId() {
		return getLong("business_id");
	}

	public M setTypeId(Integer typeId) {
		set("type_id", typeId);
		return (M)this;
	}
	
	public Integer getTypeId() {
		return getInt("type_id");
	}

	public M setStatusId(Integer statusId) {
		set("status_id", statusId);
		return (M)this;
	}
	
	public Integer getStatusId() {
		return getInt("status_id");
	}

	public M setScenarioId(Integer scenarioId) {
		set("scenario_id", scenarioId);
		return (M)this;
	}
	
	public Integer getScenarioId() {
		return getInt("scenario_id");
	}

	public M setNextTime(java.util.Date nextTime) {
		set("next_time", nextTime);
		return (M)this;
	}
	
	public java.util.Date getNextTime() {
		return get("next_time");
	}

	public M setCustomerId(Integer customerId) {
		set("customer_id", customerId);
		return (M)this;
	}
	
	public Integer getCustomerId() {
		return getInt("customer_id");
	}

	public M setDealDate(java.util.Date dealDate) {
		set("deal_date", dealDate);
		return (M)this;
	}
	
	public java.util.Date getDealDate() {
		return get("deal_date");
	}

	public M setBusinessName(String businessName) {
		set("business_name", businessName);
		return (M)this;
	}
	
	public String getBusinessName() {
		return getStr("business_name");
	}

	public M setMoney(java.math.BigDecimal money) {
		set("money", money);
		return (M)this;
	}
	
	public java.math.BigDecimal getMoney() {
		return get("money");
	}

	public M setDiscountRate(java.math.BigDecimal discountRate) {
		set("discount_rate", discountRate);
		return (M)this;
	}
	
	public java.math.BigDecimal getDiscountRate() {
		return get("discount_rate");
	}

	public M setRemark(String remark) {
		set("remark", remark);
		return (M)this;
	}
	
	public String getRemark() {
		return getStr("remark");
	}

	public M setCreateUserId(Integer createUserId) {
		set("create_user_id", createUserId);
		return (M)this;
	}
	
	public Integer getCreateUserId() {
		return getInt("create_user_id");
	}

	public M setOwnerUserId(Integer ownerUserId) {
		set("owner_user_id", ownerUserId);
		return (M)this;
	}
	
	public Integer getOwnerUserId() {
		return getInt("owner_user_id");
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

	public M setBatchId(String batchId) {
		set("batch_id", batchId);
		return (M)this;
	}
	
	public String getBatchId() {
		return getStr("batch_id");
	}

	public M setRoUserId(String roUserId) {
		set("ro_user_id", roUserId);
		return (M)this;
	}
	
	public String getRoUserId() {
		return getStr("ro_user_id");
	}

	public M setRwUserId(String rwUserId) {
		set("rw_user_id", rwUserId);
		return (M)this;
	}
	
	public String getRwUserId() {
		return getStr("rw_user_id");
	}

	public M setIsEnd(Integer isEnd) {
		set("is_end", isEnd);
		return (M)this;
	}
	
	public Integer getIsEnd() {
		return getInt("is_end");
	}

	public M setStatusRemark(String statusRemark) {
		set("status_remark", statusRemark);
		return (M)this;
	}
	
	public String getStatusRemark() {
		return getStr("status_remark");
	}

	public M setDeptId(Integer deptId) {
		set("dept_id", deptId);
		return (M)this;
	}
	
	public Integer getDeptId() {
		return getInt("dept_id");
	}

	public M setAscription(String ascription) {
		set("ascription", ascription);
		return (M)this;
	}
	
	public String getAscription() {
		return getStr("ascription");
	}

	public M setApplicationScenario(Integer applicationScenario) {
		set("application_scenario", applicationScenario);
		return (M)this;
	}
	
	public Integer getApplicationScenario() {
		return getInt("application_scenario");
	}

	public M setMapAddress(String mapAddress) {
		set("map_address", mapAddress);
		return (M)this;
	}
	
	public String getMapAddress() {
		return getStr("map_address");
	}

	public M setFixedTime(java.util.Date fixedTime) {
		set("fixed_time", fixedTime);
		return (M)this;
	}
	
	public java.util.Date getFixedTime() {
		return get("fixed_time");
	}

	public M setPruductTime(java.util.Date pruductTime) {
		set("pruduct_time", pruductTime);
		return (M)this;
	}
	
	public java.util.Date getPruductTime() {
		return get("pruduct_time");
	}

	public M setProject(String project) {
		set("project", project);
		return (M)this;
	}
	
	public String getProject() {
		return getStr("project");
	}

	public M setPartner(String partner) {
		set("partner", partner);
		return (M)this;
	}
	
	public String getPartner() {
		return getStr("partner");
	}

	public M setAnnualProduction(String annualProduction) {
		set("annual_production", annualProduction);
		return (M)this;
	}
	
	public String getAnnualProduction() {
		return getStr("annual_production");
	}

	public M setStageWinRate(Integer stageWinRate) {
		set("stage_win_rate", stageWinRate);
		return (M)this;
	}
	
	public Integer getStageWinRate() {
		return getInt("stage_win_rate");
	}

	public M setShareholderRelation(Integer shareholderRelation) {
		set("shareholder_relation", shareholderRelation);
		return (M)this;
	}
	
	public Integer getShareholderRelation() {
		return getInt("shareholder_relation");
	}

}