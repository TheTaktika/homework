package ru.aston.hometask.task4;

public class TwoThread {
    private static final Object lock = new Object();
    private static volatile boolean turn = true;

    public static void twoThreadMethod() {
        Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (!turn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    System.out.println("1 ");
                    turn = false;
                    lock.notify();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (turn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    System.out.println("2 ");
                    turn = true;
                    lock.notify();
                }
            }
        });

        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        twoThreadMethod();
    }
}
