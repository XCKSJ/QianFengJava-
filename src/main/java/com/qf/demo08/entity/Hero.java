package com.qf.demo08.entity;

import java.io.Serializable;

/**
 * (Hero)实体类
 *
 * @author makejava
 * @since 2023-06-25 16:06:19
 */
public class Hero implements Serializable {
    private static final long serialVersionUID = 105638804683880493L;

    private Integer id;

    private String name;

    private Integer times;

    private Integer pic;

    private Integer win;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Integer getPic() {
        return pic;
    }

    public void setPic(Integer pic) {
        this.pic = pic;
    }

    public Integer getWin() {
        return win;
    }

    public void setWin(Integer win) {
        this.win = win;
    }

}

