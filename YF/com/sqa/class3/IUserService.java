package com.sqa.class3;

import com.sqa.class1.User;

public interface IUserService {
    boolean login(User user);
    User register(String name, int age, String gender, String password);
}
