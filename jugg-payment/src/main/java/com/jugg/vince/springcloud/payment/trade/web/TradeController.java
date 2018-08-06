package com.jugg.vince.springcloud.payment.trade.web;

import com.jugg.vince.springcloud.payment.trade.model.TradeReqModel;
import com.jugg.vince.springcloud.payment.trade.model.TradeResModel;
import com.jugg.vince.springcloud.payment.trade.service.TradeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Author:   Vince
 * Date:     2018/8/6 下午3:49
 * Description:
 */

@RestController
@RequestMapping("api")
public class TradeController {
    @Resource
    private TradeService tradeService;

    @Value("${jugg.payment.value}")
    private String value;

    @PostMapping(value = "/trade", produces = "application/json")
    public TradeResModel trade(@RequestBody TradeReqModel request) {
        return tradeService.trade(request);
    }

    @GetMapping(value = "/value")
    public String getValue() {
        return value;
    }
}
