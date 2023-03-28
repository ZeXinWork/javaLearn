package com.imooc.sync.pojo;

public class Custom implements Runnable {

   public Goods goods;

    @Override
    public void run() {
        goods.sale();
    }
}
