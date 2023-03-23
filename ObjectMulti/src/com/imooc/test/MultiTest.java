package com.imooc.test;

import com.imooc.Animal;
import com.imooc.Cat;

/**
 * 测试类，测试多态
 */
public class MultiTest {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.run();//父类方法可以直接调用
        Cat cat = (Cat) animal;
        cat.sleep();
        if (animal instanceof Cat) {
            System.out.println("我是cat的实例");
        }
    }
}
