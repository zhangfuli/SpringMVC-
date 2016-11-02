package com.example;

import com.example.model.User;

import java.beans.PropertyEditorSupport;

/**
 * Created by zfl on 2016/11/2.
 */
public class Myproperty extends PropertyEditorSupport{
    @Override
    public void setAsText(String text) throws IllegalArgumentException{
        User u = new User();
        String[] textArray = text.split(",");
        u.setName(textArray[0]);
        u.setAge(Integer.parseInt(textArray[1]));
        this.setValue(u);
    }
    public static void main(String[] args){
        Myproperty editor = new Myproperty();
        editor.setAsText("tom,22");
        System.out.println(editor.getValue());
    }
}
