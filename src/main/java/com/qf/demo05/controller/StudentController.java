package com.qf.demo05.controller;

import com.alibaba.fastjson.JSONObject;
import com.qf.demo05.result.R;
import com.qf.demo05.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Resource
    StudentService studentService;

    /**
     * 查询
     * @return
     */
    public R query() {
        return studentService.query();
    }

    @PostMapping("/teacher")
    public R insertTeacher(@RequestBody String data){
        System.out.println(data);

        JSONObject jsonObject = JSONObject.parseObject(data);

        String name = jsonObject.getString("name");
        String score = jsonObject.getString("score");

        System.out.println(name);
        System.out.println(score);

        return new R("200", "success", jsonObject);
    }
}
