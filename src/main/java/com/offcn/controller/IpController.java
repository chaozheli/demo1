package com.offcn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ChaoZhe Li
 * @Date 2020/9/9 19:21
 * @Version 1.0
 */
@RestController
public class IpController {
    @Value("${offcn_ip}")
    private String offcn_ip;

    @Value("${offcn_port}")
    private String offcn_port;

    @GetMapping("/getValue")
    public String getValue(){
        return offcn_ip+offcn_port;
    }
}
