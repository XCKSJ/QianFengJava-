package com.qf.demo05.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/query")
    public String query(){
        return "查询功能";
    }
}
