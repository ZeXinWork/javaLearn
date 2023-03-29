package com.imooc.collection.list;

import java.util.LinkedList;

public class LinkedListSample {
    public static void main(String[] args) {
        LinkedList<String> bookList = new LinkedList<>();
        bookList.addFirst("西游记");
        bookList.addLast("水浒传");
        System.out.println(bookList);
    }
}
