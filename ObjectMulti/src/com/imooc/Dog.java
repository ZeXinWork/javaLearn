package com.imooc;

/**
 * 测试多态，此为子类
 */
public class Dog extends Animal {
    public String kind;


    public Dog() {
    }

    public Dog(String kind) {
        this.kind = kind;
    }

    /**
     * 获取
     *
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * 设置
     *
     * @param kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    public String toString() {
        return "Dog{kind = " + kind + "}";
    }

    public void burk() {
        System.out.println("狗在叫");
    }
}
