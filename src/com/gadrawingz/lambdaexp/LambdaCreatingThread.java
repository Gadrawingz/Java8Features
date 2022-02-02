package com.gadrawingz.lambdaexp;

public class LambdaCreatingThread {
    public static void main(String[] args) {

        // Thread example without lambda
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 is running...");
            }
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();


        // Thread example with lambda
        Runnable runnable2 = () -> System.out.println("Thread 2 is running...");
        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }
}
