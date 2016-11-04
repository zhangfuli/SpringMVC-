package com.example.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by zfl on 2016/11/4.
 */
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  //自动生成id

            int id;
    private String name;
    private long no;

    //数据库自带
    private long createAt;
    private long updateAt;
    private boolean isdelete = false;

    public Student(String name, long no) {
        this.name = name;
        this.no = no;
        this.createAt = System.currentTimeMillis();
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNo() {
        return no;
    }

    public void setNo(long no) {
        this.no = no;
    }
}
