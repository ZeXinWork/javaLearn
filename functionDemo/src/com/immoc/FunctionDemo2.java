package com.immoc;

public class FunctionDemo2 {

    public void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public boolean searchArr(int[] arr, int n) {
        boolean flag = false;
        for (int i : arr) {
            System.out.println(i);
            if (i == n) {
                flag = true;
                break;
            }
        }
        return flag;
    }


    public static void main(String[] args) {
        FunctionDemo2 functionDemo2 = new FunctionDemo2();
        int[] arr = {1, 2, 3, 4, 5};
//        functionDemo2.printArray(arr);
        boolean b = functionDemo2.searchArr(arr, 2);
        System.out.println(b);
    }

}
