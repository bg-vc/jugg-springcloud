package com.jugg.vince.springcloud.payment.trade.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jugg.vince.springcloud.payment.trade.model.TradeReqModel;
import com.jugg.vince.springcloud.payment.trade.model.TradeResModel;
import com.jugg.vince.springcloud.payment.trade.service.TradeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Author:   Vince
 * Date:     2018/8/6 下午4:10
 * Description:
 */
@Slf4j
@Service
public class TradeServiceImpl implements TradeService {
    @Override
    public TradeResModel trade(TradeReqModel req) {
        log.info("request:{}", JSONObject.toJSONString(req));
        TradeResModel response = new TradeResModel();
        response.setRetCode("0000");
        response.setRetInfo("payment处理成功");
        log.info("response:{}", JSONObject.toJSONString(response));
        try {
            Thread.sleep(1L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return response;
    }
}
