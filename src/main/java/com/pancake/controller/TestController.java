package com.pancake.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by m on 2017/6/7.
 */
@RestController
public class TestController {
    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;

//    @Autowired
//    private GirlProperty girl;

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
//        return "cupSize: " + cupSize + ", age: " + age + "\n" + content;
//        return girl.getCupSize() + ", " + girl.getAge();
        return "id: " + id;
    }
}
