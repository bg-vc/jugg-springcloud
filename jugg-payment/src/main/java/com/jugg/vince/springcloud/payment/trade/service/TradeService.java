package com.jugg.vince.springcloud.payment.trade.service;


import com.jugg.vince.springcloud.payment.trade.model.TradeReqModel;
import com.jugg.vince.springcloud.payment.trade.model.TradeResModel;

/**
 * Author:   Vince
 * Date:     2018/8/6 下午3:33
 * Description:
 */
public interface TradeService {
    /**
     *
     * @param req
     * @return
     */
    TradeResModel trade(TradeReqModel req);

}
