package com.qf.demo08.service;

import com.qf.demo08.entity.Hero;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Hero)表服务接口
 *
 * @author makejava
 * @since 2023-06-25 16:06:20
 */
public interface HeroService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Hero queryById(Integer id);

    /**
     * 分页查询
     *
     * @param hero        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<Hero> queryByPage(Hero hero, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param hero 实例对象
     * @return 实例对象
     */
    Hero insert(Hero hero);

    /**
     * 修改数据
     *
     * @param hero 实例对象
     * @return 实例对象
     */
    Hero update(Hero hero);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
