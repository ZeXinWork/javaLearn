package com.imooc.test;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        ExceptionTest exception = new ExceptionTest();
        try {
            exception.test();
        } catch (Exception e) {
            System.out.println("除数不能为0");
            e.printStackTrace();
        }
    }

    public void test() throws Exception {
        System.out.println("请输入一个整数");
        Scanner scan = new Scanner(System.in);
        int next = scan.nextInt();
        System.out.println("请输入第二个整数");
        int next2 = scan.nextInt();
        if (next2 == 0) {
            throw new Exception();
        } else {
            System.out.println(next / next2);
        }
    }
}
