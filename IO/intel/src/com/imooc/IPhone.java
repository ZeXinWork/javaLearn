package com.imooc;

public interface IPhone {

    void connection();
    int tmp=30;

    //默认方法，子类无需重写
    default void open(){
        System.out.println("open");
    }
}
