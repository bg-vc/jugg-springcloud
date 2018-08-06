package com.jugg.vince.springcloud.gateway.payment.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class TradeResModel implements Serializable  {

	private static final long serialVersionUID = -5874620321490055445L;
	
	/**
	 * 返回码
	 */
	private String retCode;
	
	/**
	 * 返回详情
	 */
	private String retInfo;


}
