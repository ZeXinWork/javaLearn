package com.imooc;

/**
 * 测试多态，此为子类
 */
public class Cat extends Animal {

    public int age;


    public Cat() {
    }

    public Cat(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Cat{age = " + age + "}";
    }

    public void sleep() {
        System.out.println("猫在睡觉1");
    }
}
