package org.lqf.current.chapter2.threadd;

/**
 * Created by sally on 2017/2/17.
 * synchronized保证了原子性
 */
public class AccountingSync2 implements Runnable {
    static AccountingSync2 instance = new AccountingSync2();
    static int i = 0;
    public synchronized void increase() {
        i++;
    }
    public void run() {
        for (int j = 0;j<1000000;j++) {
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
