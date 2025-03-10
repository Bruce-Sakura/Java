package com.sqa.class2;

public class Dog extends Animal {

    private String gender;

    public Dog(String name, int age, String gender) {
        super(name, age);
    }

    public void swim() {
        System.out.println(this.getName() + " swimming");
    }

    public void swim(String flag) {

    }

    public void swim(String flag, String flag1) {

    }

    public void swim(int flag, String flag1) {

    }

    public void swim(String flag, int flag1) {

    }


    @Override //重写
    public void eat() {
        System.out.println(this.getName() + " eating shit");
    }
}
