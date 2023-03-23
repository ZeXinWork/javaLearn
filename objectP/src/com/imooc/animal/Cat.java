package com.imooc.animal;

public class Cat {
    private String name;
    private int age;


    public static int price;

    public Cat() {
    }

    static {
        System.out.println("我只会执行一次");
    }


    {
        System.out.println("只要实例化对象我就会执行");
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Cat{name = " + name + ", age = " + age + "}";
    }

    public static void getStaticName() {
        System.out.println("hhh");
    }
}
