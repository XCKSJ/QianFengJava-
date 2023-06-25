package com.qf.demo05.service.impl;

import com.qf.demo05.dao.StudentDao;
import com.qf.demo05.result.R;
import com.qf.demo05.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentDao studentDao;

    /**
     * 查询
     * @return
     */
    @Override
    public R query() {
        return new R("200", "success", "查询学生信息");
    }
}
