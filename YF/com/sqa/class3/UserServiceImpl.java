package com.sqa.class3;

import com.sqa.class1.User;

//使用接口的
public class UserServiceImpl implements IUserService {

    @Override
    public boolean login(User user) {
        if (user.getName().equals("admin") && user.getPassword().equals("admin")) {
            return true;
        }
        return false;
    }

    @Override
    public User register(String name, int age, String gender, String password) {
        User user = new User(name, age, gender, password);
        return user;
    }
}
