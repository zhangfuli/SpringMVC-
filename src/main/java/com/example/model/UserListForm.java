package com.example.model;

import java.util.List;

/**
 * Created by zfl on 2016/10/30.
 */
public class UserListForm {
    private List<User> users;

    public List<User> getUsers(){
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserListForm{" +
                "users=" + users +
                '}' ;
    }
}
