package com.immoc;

public class FunctionDemo1 {
    public void printStar() {
        System.out.println("********************");
    }

    public int getArea() {
        int width = 10;
        int height = 20;
        return width * height;
    }

    public void getMax(int a, int b) {
        System.out.println(a > b ? "a" : "b");
    }

    public int getFactorial(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        FunctionDemo1 demo1 = new FunctionDemo1();
//        demo1.printStar();
//        int area = demo1.getArea();
//        System.out.println(area);
//        demo1.getMax(1, 2);
//        //TODO:求n的阶乘
//        int factorial = demo1.getFactorial(2);
//        System.out.println(factorial);
        //TODO:求1+加到n的阶乘 1!+2!+..n!
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + demo1.getFactorial(i);
        }
        System.out.println(sum);
    }
}
