package com.immoc;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        System.out.println(intArray[0]); //int类型的数组默认值为0
        char[] chars = new char[10]; //,默认值为空字符,即'\u0000'.
        System.out.println("char类型的默认值: " +chars[0]);
        String[] stringArray=new String[10];
        System.out.println(stringArray[0]);
        float[] intArray2 = new float[10];
        System.out.println(intArray2[0]);
        for (int i : intArray) {
            System.out.println(i);
        }
    }
}
