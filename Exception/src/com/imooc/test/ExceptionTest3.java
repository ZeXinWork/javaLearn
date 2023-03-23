package com.imooc.test;

import com.imooc.pojo.HotelException;

public class ExceptionTest3 {
    public static void main(String[] args) {
        ExceptionTest3 exceptionTest3 = new ExceptionTest3();
        try {
            exceptionTest3.test();
        } catch (HotelException e) {
            System.out.println(e.getMessage());
        }
    }

    public void test() throws HotelException {
        throw new HotelException();
    }
}
