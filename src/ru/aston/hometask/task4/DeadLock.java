package ru.aston.hometask.task4;

public class DeadLock {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void deadLockMethod() {
        Thread thread1 = new Thread(() -> {
            System.out.println("trying acquire lock1");
            synchronized (lock1) {
                System.out.println("lock1 acquired");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("trying acquire lock2");
                synchronized (lock2) {
                    System.out.println("lock2 acquired");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("trying acquire lock2");
            synchronized (lock2) {
                System.out.println("lock2 acquired");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("trying acquire lock1");
                synchronized (lock1) {
                    System.out.println("lock1 acquired");
                }
            }
        });

        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        deadLockMethod();
    }
}
