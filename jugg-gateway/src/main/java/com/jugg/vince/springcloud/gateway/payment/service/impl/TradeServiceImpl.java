package com.jugg.vince.springcloud.gateway.payment.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jugg.vince.springcloud.gateway.payment.model.TradeReqModel;
import com.jugg.vince.springcloud.gateway.payment.model.TradeResModel;
import com.jugg.vince.springcloud.gateway.payment.service.TradeService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Author:   Vince
 * Date:     2018/8/6 下午3:37
 * Description:
 */

@Slf4j
@Service
public class TradeServiceImpl implements TradeService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "tradeFallback")
    @Override
    public TradeResModel trade(TradeReqModel req) {
        log.info("request:{}", JSONObject.toJSONString(req));
        TradeResModel response = restTemplate.postForObject("http://jugg-payment/api/trade", req, TradeResModel.class);
        log.info("response:{}", JSONObject.toJSONString(response));
        return response;
    }

    @Override
    public TradeResModel tradeFallback(TradeReqModel req) {
        log.info("request:{}", JSONObject.toJSONString(req));
        TradeResModel response = new TradeResModel();
        response.setRetCode("3000");
        response.setRetInfo("gateway:tradeFallback");
        log.info("response:{}", JSONObject.toJSONString(response));
        return response;
    }


}
