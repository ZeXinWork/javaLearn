package com.imooc.thread;

import java.util.Random;

public class ThreadSample1 {

    class RunTest extends Thread{
        @Override
        public void run() {

            int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
            for (int j = 0; j < arr1.length-1; j++) {
                int i = new Random().nextInt(10);
                try {
                    Thread.sleep(1000);
                    System.out.println(this.getName() + arr1[i]);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void runStart(){
        RunTest runTest = new RunTest();
        RunTest runTest2 = new RunTest();

        runTest.setName("小明");
        runTest2.setName("小张");
        runTest.start();
        runTest2.start();
    }


    public static void main(String[] args) {

        new ThreadSample1().runStart();
    }
}
