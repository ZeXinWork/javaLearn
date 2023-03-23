package com.imooc;

public class test {
    public static void main(String[] args) {
        Integer integer = new Integer(100);
        Integer integer2 = new Integer(100);
        System.out.println(integer == integer2); //两个对象比较的是地址值

        Integer int1 = 100;
        Integer int2 = 100;
        System.out.println(int1 == int2); //除了float和double，都有常量池作为缓存,-128-127之间

        Integer int3 = 200;
        Integer int4 = 100;
        System.out.println(int3 == int4);//超过上面的区间
        Integer int5 = 500;
        System.out.println(int5 == 500); //自动拆箱
    }

}
