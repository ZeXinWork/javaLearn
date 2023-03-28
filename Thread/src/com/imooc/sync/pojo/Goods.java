package com.imooc.sync.pojo;

public class Goods {
    public synchronized void sale(){
        if(Counter.counter>0){
            System.out.println("用户购买成功");
            Counter.counter--;
        }else{
            System.out.println("用户购买失败，库存不足");
        }
    }
}
