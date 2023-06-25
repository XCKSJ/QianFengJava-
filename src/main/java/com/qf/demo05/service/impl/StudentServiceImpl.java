package com.qf.demo05.service.impl;

import com.qf.demo05.result.R;
import com.qf.demo05.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    /**
     * 查询
     * @return
     */
    @Override
    public R query() {
        return new R("200", "success", "查询学生信息");
    }
}
