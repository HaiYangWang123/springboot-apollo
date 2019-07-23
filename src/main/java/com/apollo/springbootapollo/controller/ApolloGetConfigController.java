package com.apollo.springbootapollo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ApolloGetConfigController
 * @Description: todo java类作用描述
 * @Author: hywang
 * @CreateDate: 2018/10/9 11:10 AM
 * @Version: 1.0
 */
@RestController
public class ApolloGetConfigController {

    @Value("${baidu.url:default}")
    private String value;

    @GetMapping("/getConfig")
    public String getConfig(){
        return value;
    }
}
