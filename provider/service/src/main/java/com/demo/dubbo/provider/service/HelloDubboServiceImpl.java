package com.demo.dubbo.provider.service;

import org.apache.dubbo.config.annotation.Service;
import service.HelloDubboService;

/**
 * @author Admin
 */
@Service(version = "1.0.0")
public class HelloDubboServiceImpl implements HelloDubboService {
    @Override
    public String echo(String string) {
        return "Echo hello Dubbo";
    }
}
