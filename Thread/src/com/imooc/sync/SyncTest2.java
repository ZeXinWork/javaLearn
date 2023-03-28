package com.imooc.sync;

import com.imooc.sync.pojo.Counter;
import com.imooc.sync.pojo.Custom;
import com.imooc.sync.pojo.Goods;

public class SyncTest2 {
    public static void main(String[] args) throws InterruptedException {
        Goods goods = new Goods();

        for (int i = 0; i < 5; i++) {
            Custom custom = new Custom();
            custom.goods = goods;
            Thread thread = new Thread(custom);
            thread.start();

        }
        Thread.sleep(50);
        System.out.println(Counter.counter);
    }
}
