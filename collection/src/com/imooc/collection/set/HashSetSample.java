package com.imooc.collection.set;

import java.util.HashSet;

public class HashSetSample {
    public static void main(String[] args) {
        HashSet<String> mobileList = new HashSet<>();
        mobileList.add("999");
        mobileList.add("123");
        mobileList.add("456");
        mobileList.add("123"); //不允许重复插入数据
        mobileList.add("789");

        boolean contains = mobileList.contains("789");
        System.out.println(mobileList);
        System.out.println(contains);

        String a = "123";
        String b = "123";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());


        HashSet<Goods> goods = new HashSet<>();
        goods.add(new Goods("123", "test"));
        goods.add(new Goods("123", "te1st"));
        goods.add(new Goods("123", "test"));
        goods.forEach(v-> System.out.println(v));
    }
}
