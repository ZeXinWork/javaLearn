package com.imooc.test;

import com.imooc.animal.Dog;

/**
 * 用来测试对象继承类的方法重写
 */
public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("花花");
        System.out.println(dog.getName());

        dog.eat();//调用父类的方法
        dog.sleep();//重写父类的方法，返回值必须相同
        dog.jump();//重写父类方法，返回值可以不同，因为返回值是自定义属性
    }
}
