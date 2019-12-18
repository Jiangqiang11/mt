package com.jq.mt_data_view.common;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping("/say")
    public String sayHello(){
        return "hello world";
    }
}
