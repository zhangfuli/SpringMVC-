package com.example.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by zfl on 2016/10/30.
 */
@XmlRootElement(name="admin")
public class Admin {
    private String name;
    private Integer age;
    @XmlElement(name="age")
    public Integer getAge() {
        return age;
    }
    @XmlElement(name="name")
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
