package com.imooc.thread;

import java.util.Random;

public class ThreadSample2 {
    class Runner implements  Runnable{
        @Override
        public void run() {
            Integer index = new Random().nextInt(10);

            for (int i = 0; i <10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "已经跑了" + (i + 1) * index);
            }
        }
    }
    public void  startTest(){
        Runner runner = new Runner();
        Thread thread = new Thread(runner);
        thread.setName("小明");
        thread.start();
    }
    public static void main(String[] args) {
        new ThreadSample2().startTest();
    }
}
