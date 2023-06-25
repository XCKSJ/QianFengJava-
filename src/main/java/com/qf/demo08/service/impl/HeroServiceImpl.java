package com.qf.demo08.service.impl;

import com.qf.demo08.entity.Hero;
import com.qf.demo08.dao.HeroDao;
import com.qf.demo08.service.HeroService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Hero)表服务实现类
 *
 * @author makejava
 * @since 2023-06-25 16:11:13
 */
@Service("heroService")
public class HeroServiceImpl implements HeroService {
    @Resource
    private HeroDao heroDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Hero queryById(Integer id) {
        return this.heroDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param hero        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Hero> queryByPage(Hero hero, PageRequest pageRequest) {
        long total = this.heroDao.count(hero);
        return new PageImpl<>(this.heroDao.queryAllByLimit(hero, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param hero 实例对象
     * @return 实例对象
     */
    @Override
    public Hero insert(Hero hero) {
        this.heroDao.insert(hero);
        return hero;
    }

    /**
     * 修改数据
     *
     * @param hero 实例对象
     * @return 实例对象
     */
    @Override
    public Hero update(Hero hero) {
        this.heroDao.update(hero);
        return this.queryById(hero.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.heroDao.deleteById(id) > 0;
    }
}
