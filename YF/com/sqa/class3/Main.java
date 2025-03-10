package com.sqa.class3;

import com.sqa.class1.User;

public class Main {
    public static void main(String[] args) {
//        UserServiceImpl userService = new UserServiceImpl();
//        User user = userService.register("admin", 20, "male", "admin");
//        boolean isLogin = userService.login(user);
//        if (isLogin) {
//            System.out.println("Successfully logged in!");
//        }else {
//            System.out.println("Login failed!");
//        }
        IUserService userService = new UserServiceImpl();
        User user = userService.register("admin", 20, "male", "admin");
        boolean isLogin = userService.login(user);
        if (isLogin) {
            System.out.println("Successfully logged in!");
        } else {
            System.out.println("Login failed!");
        }
    }
}
