package com.sqa.class2;

public class Cat extends Animal {
    private String gender;

    public Cat(String name, int age, String gender) {
        super(name, age); // 在调用Animal里的值
    }

    public void climbTree(){
        System.out.println(this.getName() + " climbs tree!!!");

    }
}
