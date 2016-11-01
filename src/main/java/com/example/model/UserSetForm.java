package com.example.model;

import java.util.Set;

/**
 * Created by zfl on 2016/10/31.
 */
public class UserSetForm {
    private Set<User> users;

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserSetForm{" +
                "users=" + users +
                '}';
    }

}
