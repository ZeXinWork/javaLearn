package com.imooc.animal;

/**
 * 这个用来做父类
 * <p>
 * 课程：对象的继承
 */
public class Animal {

    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(this.getName() + "在吃饭");
    }

    public void sleep() {
        System.out.println(this.getName() + "在睡觉");
    }

    public Animal jump() {
        System.out.println(this.getName() + "在跳跃");
        return new Animal();
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
        return "Animal{name = " + name + ", age = " + age + "}";
    }
}
