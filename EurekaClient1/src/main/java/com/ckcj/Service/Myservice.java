package com.ckcj.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Service
public class Myservice {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping
    public String hi(String name){
        return restTemplate.getForObject("http://service-user/hi?name=" + name, String.class);
    }
}
