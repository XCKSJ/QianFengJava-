package com.qf.demo05.pojo;

public class Student {
    private Integer id;
    private String name;
    private String sno;
    private Integer age;

    public Student() {
    }

    public Student(Integer id, String name, String sno, Integer age) {
        this.id = id;
        this.name = name;
        this.sno = sno;
        this.age = age;
    }

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

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sno='" + sno + '\'' +
                ", age=" + age +
                '}';
    }
}
