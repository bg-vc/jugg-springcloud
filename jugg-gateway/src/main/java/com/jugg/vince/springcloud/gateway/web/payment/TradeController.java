package com.jugg.vince.springcloud.gateway.web.payment;

import com.jugg.vince.springcloud.gateway.payment.model.TradeReqModel;
import com.jugg.vince.springcloud.gateway.payment.model.TradeResModel;
import com.jugg.vince.springcloud.gateway.payment.service.TradeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Author:   Vince
 * Date:     2018/8/6 下午3:49
 * Description:
 */

@Api(tags = {"1、交易"})
@RestController
@RequestMapping("api/payment")
public class TradeController {
    @Resource
    private TradeService tradeService;

    @Value("${jugg.gateway.value}")
    private String value;

    @ApiOperation(value="交易", notes="交易")
    @PostMapping(value = "/trade", produces = "application/json")
    public TradeResModel trade(@RequestBody TradeReqModel request) {
        return tradeService.trade(request);
    }

    @ApiOperation(value="value", notes="value")
    @GetMapping(value = "/value")
    public String getValue() {
        return value;
    }

}
