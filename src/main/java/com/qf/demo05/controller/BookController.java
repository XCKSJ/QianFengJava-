package com.qf.demo05.controller;

import com.alibaba.fastjson.JSONObject;
import com.qf.demo05.result.R;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/query")
    public R query(){
        return new R("200", "success", "查询成功");
    }

}
