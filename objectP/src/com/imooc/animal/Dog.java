package com.imooc.animal;

public class Dog extends Animal {
    public void sleep() {
        System.out.println(this.getName() + "不想睡觉");
    }

    public Dog jump() {
        System.out.println(this.getName() + "不想跳跃");
        return new Dog();
    }
}
