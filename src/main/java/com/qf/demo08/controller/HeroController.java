package com.qf.demo08.controller;

import com.qf.demo08.entity.Hero;
import com.qf.demo08.service.HeroService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Hero)表控制层
 *
 * @author makejava
 * @since 2023-06-25 16:06:19
 */
@RestController
@RequestMapping("hero")
public class HeroController {
    /**
     * 服务对象
     */
    @Resource
    private HeroService heroService;

    /**
     * 分页查询
     *
     * @param hero        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Hero>> queryByPage(Hero hero, PageRequest pageRequest) {
        return ResponseEntity.ok(this.heroService.queryByPage(hero, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Hero> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.heroService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param hero 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Hero> add(Hero hero) {
        return ResponseEntity.ok(this.heroService.insert(hero));
    }

    /**
     * 编辑数据
     *
     * @param hero 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Hero> edit(Hero hero) {
        return ResponseEntity.ok(this.heroService.update(hero));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.heroService.deleteById(id));
    }

}

