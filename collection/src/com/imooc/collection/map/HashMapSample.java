package com.imooc.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapSample {
    public static void main(String[] args) {
        HashMap<String, Object> studentMap = new HashMap<>();
        studentMap.put("name", "张三");
        studentMap.put("age", 18);
        Object age = studentMap.put("age", 20); //会覆盖之前的18，并返回之前的值
        System.out.println(age);
        boolean name = studentMap.containsKey("name");
        System.out.println(name); //判断是否有该key

        //第一种遍历的方式
        for (String s : studentMap.keySet()) {
            System.out.println(s + ":" + studentMap.get(s));
        }

        //第二种遍历方式
        studentMap.forEach((key, value) -> System.out.println(key + ":" + value));


        //第三种遍历方式
        Iterator<Map.Entry<String, Object>> iterator = studentMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Object> next = iterator.next();
            System.out.println(next.getKey() + ":" + next.getValue());
        }
    }
}
