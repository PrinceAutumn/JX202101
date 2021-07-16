package com.ckcj.HouseMaster;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HouseMasterApplication {
    @ResponseBody
    public static void main(String[] args) {

        SpringApplication.run(HouseMasterApplication.class, args);
    }

    @ResponseBody
    @RequestMapping("/house/{name}")
    public void getHouse(@PathVariable String name) {
    }
}
