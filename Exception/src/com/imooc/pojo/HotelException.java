package com.imooc.pojo;

public class HotelException extends Exception {

    public HotelException() {
        super("自定义的异常");
    }


    public String toString() {
        return "HotelException{}";
    }
}
