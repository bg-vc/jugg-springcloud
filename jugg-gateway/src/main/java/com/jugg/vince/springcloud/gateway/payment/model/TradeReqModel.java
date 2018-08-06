package com.jugg.vince.springcloud.gateway.payment.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class TradeReqModel implements Serializable {
	
	private static final long serialVersionUID = 3882433164090265502L;

	/**
	 * 业务单号
	 */
	private String sourceBizId;

	/**
	 * 银行编码
	 */
	private String bankCode;

	/**
	 * 银行卡账户名称
	 */
	private String accountName;

	/**
	 * 银行卡方账号
	 */
	private String accountNo;

	/**
	 * 金额
	 */
	private BigDecimal amount;

	/**
	 * 备注
	 */
	private String remark;

	
}
