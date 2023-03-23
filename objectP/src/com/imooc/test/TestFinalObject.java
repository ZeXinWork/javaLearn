package com.imooc.test;

import com.imooc.animal.AnimalFinalTest;
import com.imooc.animal.Dog;

/**
 * 测试祖先object类和final关键字
 */
public class TestFinalObject {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.equals(new Dog()));
        String str1 = new String("123");
        String str2 = new String("123");
        System.out.println(str1.equals(str2));


        AnimalFinalTest animalFinalTest = new AnimalFinalTest();
        animalFinalTest.get();
    }
}
