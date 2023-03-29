package com.imooc.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListLoopSample {
    public static void main(String[] args) {
        ArrayList<String> bookList = new ArrayList<>();
        bookList.add("三国演义");
        bookList.add("水浒传");
        bookList.add(1,"红楼梦");//往第一位添加
        bookList.add(bookList.size()-1,"西游记");

        bookList.forEach(book -> System.out.println(book));
        for (String s : bookList) {
            System.out.println(s);
        }
        Iterator<String> iterator = bookList.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
