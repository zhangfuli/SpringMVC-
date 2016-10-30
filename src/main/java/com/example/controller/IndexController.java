package com.example.controller;

import com.example.model.Admin;
import com.example.model.User;
import com.example.model.UserListForm;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zfl on 2016/10/25.
 */
@Controller
public class IndexController {
    //包装类型可以为空   基本类型不能为空
    @RequestMapping("hello_0")  //lcoalhost:8080/home?age=
    @ResponseBody
    public String hello(@RequestParam("xage") int age) { //@requestparam("") 别名
        return "age:"+age;
    }
    @RequestMapping("hello_1")
    @ResponseBody
    public String hello_1(Integer age){  //age可以为空
        return "age:"+age;
    }
    //数组的绑定方式
    @RequestMapping("array")
    @ResponseBody
    public String array(String[] name){
        StringBuilder sbf = new StringBuilder();
        for(String item : name){
            sbf.append(item).append(" ");
        }
        return sbf.toString();
    }
    @RequestMapping("object")
    @ResponseBody
    public String object(User user, Admin admin){
        return user.toString()+" "+admin.toString();
    }
    //未指定前缀的共享数据
    @InitBinder("user")
    public void initUser(WebDataBinder binder){
        binder.setFieldDefaultPrefix("user.");
    }
    @InitBinder("admin")
    public void initAdmin(WebDataBinder binder){
        binder.setFieldDefaultPrefix("admin.");
    }
    //TODO http://localhost:8080/list?users[0].name=Tom&users[1].name=Luccy
    //TODO http://localhost:8080/list?users[0].name=Tom&users[10].name=Luccy

    @RequestMapping("list")
    @ResponseBody
    public String list(UserListForm userListForm){
        return "size="+userListForm.getUsers().size()+" "+userListForm.toString();
    }

}
