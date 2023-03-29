package com.imooc.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetSample {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");

        System.out.println(strings);

    }
}
