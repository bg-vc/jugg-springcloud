package com.jugg.vince.springcloud.gateway.payment.service;

import com.jugg.vince.springcloud.gateway.payment.model.TradeReqModel;
import com.jugg.vince.springcloud.gateway.payment.model.TradeResModel;

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

    /**
     *
     * @param req
     * @return
     */
    TradeResModel tradeFallback(TradeReqModel req);
}
