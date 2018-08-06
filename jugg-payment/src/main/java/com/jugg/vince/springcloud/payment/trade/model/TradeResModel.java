package com.jugg.vince.springcloud.payment.trade.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class TradeResModel implements Serializable  {

	private static final long serialVersionUID = -5874620323390055445L;
	
	/**
	 * 返回码
	 */
	private String retCode;
	
	/**
	 * 返回详情
	 */
	private String retInfo;


}
