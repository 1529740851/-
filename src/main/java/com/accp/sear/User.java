package com.accp.sear;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -2570965279031472550L;
    private String name;
    private  int age ;
    private transient String pwd;
    //静态变量
    private static  String hoddy;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age,String pwd) {
        this.name = name;
        this.age = age;
        this.pwd=pwd;
    }

    public  String getHoddy() {
        return hoddy;
    }

    public  void setHoddy(String hoddy) {
        User.hoddy = hoddy;
    }

    public User() {}

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
