package com.wenzi.accesslayer.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class TextMsgHandler {
    @DubboReference
    private service.LogicHandleService logicHandleService;

    @GetMapping("test")
    public void doSayTest(){
        logicHandleService.logicHandle();
    }
}
