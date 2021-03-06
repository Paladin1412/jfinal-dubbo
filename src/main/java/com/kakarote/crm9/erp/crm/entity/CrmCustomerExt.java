package com.kakarote.crm9.erp.crm.entity;

import com.kakarote.crm9.erp.crm.entity.base.BaseCrmCustomerExt;
import lombok.Data;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
@Data
public class CrmCustomerExt extends BaseCrmCustomerExt<CrmCustomerExt> {
	public static final CrmCustomerExt dao = new CrmCustomerExt().dao();

	/**
	 * 主表CustomerId
	 */
	private Long mainCustomerId;
}
