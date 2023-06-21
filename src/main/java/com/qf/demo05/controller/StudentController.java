package com.qf.demo05.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @PostMapping("/teacher")
    public String insertTeacher(@RequestBody String data){
        System.out.println(data);

        JSONObject jsonObject = JSONObject.parseObject(data);

        String name = jsonObject.getString("name");
        String score = jsonObject.getString("score");

        System.out.println(name);
        System.out.println(score);

        return data;
    }
}
