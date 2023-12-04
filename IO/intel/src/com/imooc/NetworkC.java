package com.imooc;

/**
 * 用来测试接口 当作实现接口的类
 */
public class NetworkC extends NetworkCDad implements Inet,IPhone{

    private String name;
    private String brand;

    public static int tmp=30;
    public NetworkC() {
    }

    public NetworkC(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    @Override
    public void network() {
        System.out.println("network上网");
    }

    @Override
    public void connection() {
        System.out.println("network连接");
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return "NetworkC{name = " + name + ", brand = " + brand + "}";
    }
}
