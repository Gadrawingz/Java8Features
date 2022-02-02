package com.gadrawingz.methodref;

// Here we are using predefined functional interface Runnable to refer static method
public class RefStaticMethodEx2 {
    public static void ThreadStatus() {
        System.out.println("Thread is running!");
    }

    public static void main(String[] args) {
        Thread thread2 = new Thread(RefStaticMethodEx2::ThreadStatus);
        thread2.start();
    }
}
