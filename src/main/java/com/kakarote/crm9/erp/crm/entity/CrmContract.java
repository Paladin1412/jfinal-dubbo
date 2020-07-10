package com.kakarote.crm9.erp.crm.entity;


import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.kakarote.crm9.erp.admin.entity.AdminFile;
import com.kakarote.crm9.erp.crm.entity.base.BaseCrmContract;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Generated by JFinal.
 *
 * @author honglei.wan
 */
@Getter
@NoArgsConstructor
public class CrmContract extends BaseCrmContract<CrmContract> {
    private static final long serialVersionUID = 889796894479445123L;

    public static final CrmContract dao = new CrmContract().dao();

    /**
     * 合同商品信息list
     */
    private List<CrmContractProduct> contractProductList;

    /**
     * 合同付款条款list
     */
    private List<CrmContractPayment> contractPaymentList;

    /**
     * 附件
     */
    private List<AdminFile> files;

    /**
     * 待回款金额
     */
    private BigDecimal pendingPaymentMoney;

    /**
     * 负责人ID
     */
    private Long ownerUserId;

    /**
     * 负责人名称
     */
    private String ownerUserName;

    /**
     * 回款进度
     */
    private String paymentProgress;

    /**
     * 商机名称
     */
    private String businessName;

    /**
     * 客户ID
     */
    private Long customerId;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 审核状态描述
     */
    private String checkStatusName;

    /**
     * 签订人姓名
     */
    private String signUserName;

    /**
     * 签订人部门名称
     */
    private String signDeptName;

    /**
     * 申请人姓名
     */
    private String applyUserName;

    /**
     * 最近回款日期
     */
    private Date lastPaymentDate;

    /**
     * 查询未同步的合同履约信息
     * @return
     */
    public List<Record> queryContractListWithNoSync(){
        //未同步，已审核通过的数据
        return Db.find(Db.getSqlPara("crm.contract.queryContractListWithNoSync", Kv.by("syncStatus", 0).set("checkStatus",2)));
    }

    public void setContractProductList(List<CrmContractProduct> contractProductList) {
        this.contractProductList = contractProductList;
        put("contractProductList", contractProductList);
    }

    public void setContractPaymentList(List<CrmContractPayment> contractPaymentList) {
        this.contractPaymentList = contractPaymentList;
        put("contractPaymentList", contractPaymentList);
    }

    public void setFiles(List<AdminFile> files) {
        this.files = files;
        put("files", files);
    }

    public void setPendingPaymentMoney(BigDecimal pendingPaymentMoney) {
        this.pendingPaymentMoney = pendingPaymentMoney;
        put("pendingPaymentMoney", pendingPaymentMoney);
    }

    public void setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
        put("ownerUserId", ownerUserId);
    }

    public void setOwnerUserName(String ownerUserName) {
        this.ownerUserName = ownerUserName;
        put("ownerUserName", ownerUserName);
    }

    public void setPaymentProgress(String paymentProgress) {
        this.paymentProgress = paymentProgress;
        put("paymentProgress", paymentProgress);
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
        put("businessName", businessName);
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
        put("customerId", customerId);
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
        put("customerName", customerName);
    }

    public void setCheckStatusName(String checkStatusName) {
        this.checkStatusName = checkStatusName;
        put("checkStatusName", checkStatusName);
    }

    public void setSignUserName(String signUserName) {
        this.signUserName = signUserName;
        put("signUserName", signUserName);
    }

    public void setSignDeptName(String signDeptName) {
        this.signDeptName = signDeptName;
        put("signDeptName", signDeptName);
    }

    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName;
        put("applyUserName", applyUserName);
    }

    public void setLastPaymentDate(Date lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
        put("lastPaymentDate", lastPaymentDate);
    }
}