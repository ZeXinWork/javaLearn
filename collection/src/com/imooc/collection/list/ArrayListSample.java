package com.imooc.collection.list;

import java.util.ArrayList;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<String> bookList = new ArrayList<>();
        //ArrayList的添加元素方法
        bookList.add("三国演义");
        bookList.add("水浒传");
        bookList.add(1,"红楼梦");//往第一位添加
        bookList.add(bookList.size()-1,"西游记");
        System.out.println(bookList);

        //ArrayList的设置方法
        bookList.set(1, "三国演义啊");
        System.out.println(bookList);

        //ArrayList的删除方法
        bookList.remove("三国演义啊");
        System.out.println(bookList);

    }
}
