package com.imooc.animal;

/**
 * 测试单列模式
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton Singleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
