package com.imooc.test;

public class ExceptionTest2 {

    public void test1() throws Exception {
        throw new Exception("第一个异常");
    }

    public void test2() throws Exception {
        try {
            test1();
        } catch (Exception e) {
            throw new Exception("第二个异常", e);
        }

    }

    public void test3() throws Exception {
        try {
            test2();
        } catch (Exception e) {
            throw new Exception("第三个异常", e);
        }

    }

    public static void main(String[] args) {
        ExceptionTest2 exceptionTest2 = new ExceptionTest2();
        try {
            exceptionTest2.test3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
