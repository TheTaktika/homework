package ru.aston.hometask.task4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LiveLock {
    private static Lock lock1 = new ReentrantLock();
    private static Lock lock2 = new ReentrantLock();

    public static void liveLockMethod() {
        Thread thread1 = new Thread(() -> {
            while (true) {
                System.out.println("trying acquire lock1");
                if (lock1.tryLock()) {
                    System.out.println("lock1 acquired");
                    try {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("trying acquire lock2");
                        if (lock2.tryLock()) {
                            System.out.println("lock2 acquired");
                            try {
                                System.out.println("all locks acquired");
                                return;
                            } finally {
                                lock2.unlock();
                            }
                        }
                    } finally {
                        lock1.unlock();
                    }
                }
                Thread.yield();
            }
        });
        Thread thread2 = new Thread(() -> {
            while (true) {
                System.out.println("trying acquire lock2");
                if (lock2.tryLock()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("lock2 acquired");
                    try {
                        System.out.println("trying acquire lock1");
                        if (lock1.tryLock()) {
                            System.out.println("lock1 acquired");
                            try {
                                System.out.println("all locks acquired");
                                return;
                            } finally {
                                lock1.unlock();
                            }
                        }
                    } finally {
                        lock2.unlock();
                    }
                }
                Thread.yield();
            }
        });

        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        liveLockMethod();
    }
}