package com.sqa.class1;

public class User {
    private String name;
    private int age;
    private int gender;
    private String email;
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // 构造函数 初始化的东西都放在这里 他会最先运行
    public User(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        if (gender.equals("male")) {
            this.gender = 0;
        } else if (gender.equals("female")) {
            this.gender = 1;
        } else {
            this.gender = 2;
        }
    }

    public User(String name, int age, String gender, String password) {
        this.name = name;
        this.age = age;
        if (gender.equals("male")) {
            this.gender = 0;
        } else if (gender.equals("female")) {
            this.gender = 1;
        } else {
            this.gender = 2;
        }
        this.email = email;
        this.password = password;
    }


    public String getGender() {
        if (gender == 0) {
            return "male";
        } else if (gender == 1) {
            return "female";
        } else {
            return "unknown";
        }
    }

    public void setGender(String gender) {
        if (gender.equals("male")) {
            this.gender = 0;
        } else if (gender.equals("female")) {
            this.gender = 1;
        } else {
            this.gender = 2;
        }
    }
}
