package com.cykj.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @version 1.0
 * @author: Sapphier Star
 * @date: 2021/7/15 16:09
 * @desc:
 */
@RestController
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "我是房客";
    }

    @Autowired
    private RestTemplate restTemplate;




//LoadBalanced 负载均衡
@Bean
public RestTemplate getRestTemplate(){
    restTemplate = new RestTemplate();
    return restTemplate;
}
  //测试 对房东的请求
    @RequestMapping("/getHouseMsg")
    @ResponseBody
    public String gethouseMsg(@PathVariable(value="hid")String hid) {
        boolean name = false;
        System.out.println(name);
         return "我有好多房子，"+name;
        //发送请求给房东
        String remsg = restTemplate.getForObject(uri, String.class);
        return "房东说"+remsg;
    }
}
