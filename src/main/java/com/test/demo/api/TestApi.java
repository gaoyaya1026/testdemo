package com.test.demo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: testdemo
 * @description:
 * @author: GYY
 * @create: 2021-03-01 15:53
 **/

@RestController
public class TestApi {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
