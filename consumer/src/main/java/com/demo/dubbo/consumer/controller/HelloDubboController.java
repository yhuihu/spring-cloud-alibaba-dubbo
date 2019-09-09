package com.demo.dubbo.consumer.controller;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.HelloDubboService;

/**
 * @author Admin
 */
@RestController
public class HelloDubboController {
    @Reference(version = "1.0.0")
    private HelloDubboService helloDubboService;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string){
        return helloDubboService.echo(string);
    }
}
