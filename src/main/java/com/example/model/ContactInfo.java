package com.example.model;

/**
 * Created by zfl on 2016/10/27.
 */
public class ContactInfo {
    private String phone;
    private String address;

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}' ;
    }
}

