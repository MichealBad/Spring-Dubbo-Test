package com.server.service;

import api.EchoService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String str) {
        System.out.println("echo message : " + str);
        return str;
    }
}
