package com.elected.struts2;

/**
 * Created by Incredile on 2016/11/4.
 */
public class LoginAction {

    private String name;
    private String pass;


    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String login(){
        if ("admin".equals(name)&&"123456".equals(pass)){
            return "success";
        }else {
            return "error";
        }
    }


}
