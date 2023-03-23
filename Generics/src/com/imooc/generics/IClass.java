package com.imooc.generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * 自定义泛型类
 *
 * @param <T>
 */
public class IClass<T> {
    private ArrayList<T> studentList = new ArrayList<>();

    public void addList(T element) {
        this.studentList.add(element);
    }

    
    public <T> ArrayList<T> addList(T[] array) {
        ArrayList<T> ts = new ArrayList<>();
        for (T t : array) {
            ts.add(t);

        }
        return ts;
    }


    public T getRandomItem() {
        int i = new Random().nextInt(studentList.size());
        return this.studentList.get(i);
    }
}
