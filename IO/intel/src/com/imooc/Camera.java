package com.imooc;

public class Camera implements Inet{

    @Override
    public void network() {

    }

    @Override
    public void connection() {

    }

    @Override
    public void open() {
        Inet.super.open();
        System.out.println(Inet.tmp);
        //不能直接Inet.open() 因为Inet只能调用静态成员，默认成员无法直接调用
    }
}
