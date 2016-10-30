package com.example.model;

/**
 * Created by zfl on 2016/10/30.
 */
public class Admin {
    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Admin["+
                "name="+name+"\\"+
                ",age="+age+
                "]";
    }
}
