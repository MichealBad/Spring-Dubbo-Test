package com.client.service;

import api.EchoService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class ConsumService {

    @Reference(version = "1.0.0")
    private EchoService echoService;

    public String echo(String str) {
        return echoService.echo(str);
    }

}
