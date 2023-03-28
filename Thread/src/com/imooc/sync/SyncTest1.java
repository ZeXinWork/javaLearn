package com.imooc.sync;



public class SyncTest1 {
    Object lock = new Object();
    class printClass {
        public void print() throws InterruptedException {
            synchronized (lock){
                Thread.sleep(1000);
                System.out.println("1");
                Thread.sleep(1000);
                System.out.println("2");
                Thread.sleep(1000);
                System.out.println("3");
                Thread.sleep(1000);
                System.out.println("4");
            }

        }

        public synchronized void  print2() throws InterruptedException {
            Thread.sleep(1000);
            System.out.println("1");
            Thread.sleep(1000);
            System.out.println("2");
            Thread.sleep(1000);
            System.out.println("3");
            Thread.sleep(1000);
            System.out.println("4");
        }

//        public synchronized static void print3() throws InterruptedException{
//            Thread.sleep(1000);
//            System.out.println("1");
//            Thread.sleep(1000);
//            System.out.println("2");
//            Thread.sleep(1000);
//            System.out.println("3");
//            Thread.sleep(1000);
//            System.out.println("4");
//        }
    }

    class Runner implements Runnable{
        printClass pri;
        @Override
        public void run() {
            try {
                pri.print2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start(){
        printClass printClass = new printClass();
        for (int i = 0; i < 10; i++) {
            Runner runner = new Runner();
            runner.pri = printClass;
            Thread thread = new Thread(runner);
            thread.start();
        }
    }
    public static void main(String[] args) {
        new SyncTest1().start();
    }
}
