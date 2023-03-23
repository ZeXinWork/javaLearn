package com.imooc.test;

import com.imooc.Person;

public class TestAnoymous {

    public void getRead(Person person) {
        person.read();
    }

    public static void main(String[] args) {
        TestAnoymous testAnoymous = new TestAnoymous();
        testAnoymous.getRead(new Person() { //这就是匿名内部类，好处就是节省类的创建
            @Override
            public void read() {
                System.out.println("我在读书");
            }
        });
        try {

        } catch (Exception e) {

        } finally {

        }
    }
}
