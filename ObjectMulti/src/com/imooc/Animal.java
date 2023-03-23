package com.imooc;

/**
 * 测试多态，此为父类
 */
public class Animal {
    public String name;


    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
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

    public String toString() {
        return "Animal{name = " + name + "}";
    }

    public void run() {
        System.out.println("animal runs");
    }
}
