package com.imooc.generics.test;

import com.imooc.generics.IClass;

public class genericsTest {
    public static void main(String[] args) {
        IClass<String> stringIClass = new IClass<>();
        stringIClass.addList("张三");
        String[] array = {"李四", "张三", "李四", "王华四"};
        stringIClass.addList(array);
        System.out.println(stringIClass.getRandomItem());
    }
}
