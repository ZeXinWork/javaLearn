package com.imooc;

/**
 * 测试接口
 */
public interface Inet {

    int tmp = 20;

     //定义抽象方法
     void network();

     void connection();

     //默认方法，子类无需重写
     default void open(){
         System.out.println("open");
     }
}
