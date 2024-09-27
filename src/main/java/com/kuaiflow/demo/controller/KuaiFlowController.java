package com.kuaiflow.demo.controller;

import javax.annotation.Resource;

import com.kuaiflow.client.open.bean.JsonResult;
import com.kuaiflow.demo.biz.KuaiFlowBiz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * demo
 */
@RestController
@RequestMapping("kuai/flow/demod/")
public class KuaiFlowController {

    @Resource
    private KuaiFlowBiz kuaiFlowBiz;

    /**
     * 发起订单
     */
    @PostMapping("start_flow")
    public JsonResult<Long> startFlow() {
        return JsonResult.success(kuaiFlowBiz.startFlow());
    }


    @GetMapping("getAccessToken")
    public JsonResult<String> getAccessToken() {
        //从登陆上下文获取、以及获取到飞书/钉钉Id
        String customUserCode ="";
        String linkUserCode = "";
        return JsonResult.success(kuaiFlowBiz.getAccessToken(customUserCode,linkUserCode));
    }
}
