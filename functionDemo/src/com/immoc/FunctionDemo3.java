package com.immoc;

public class FunctionDemo3 {
    public void addNum(int n) {
        n++;
    }

    public void changeArr(int[] arr) {
        arr[0] = 10;
    }

    public static void main(String[] args) {
        int a = 5;
        FunctionDemo3 functionDemo3 = new FunctionDemo3();
        functionDemo3.addNum(a);
        System.out.println(a);

        int[] b = {1, 2};
        functionDemo3.changeArr(b);
        System.out.println(b[0]);//值为10 改变了地址值所以外部的变量也发生改变
    }

}
