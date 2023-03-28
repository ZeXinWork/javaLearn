package com.imooc.thread;

import java.util.Random;
import java.util.concurrent.*;

public class ThreadSample3 {

    class Runner implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            int i = new Random().nextInt(10);
            if(i/2==0){
                return 0;
            }
            return 1;
        }
    }

    public void StartTest() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Runner runner = new Runner();
        Runner runner2 = new Runner();
        Runner runner3 = new Runner();
        Future<Integer> submit = executorService.submit(runner);
        Future<Integer> submit1 = executorService.submit(runner2);
        Future<Integer> submit2 = executorService.submit(runner3);
        executorService.shutdown();


        try {System.out.println(submit.get());
            System.out.println(submit1.get());
            System.out.println(submit2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ThreadSample3().StartTest();

    }
}
