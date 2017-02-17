package org.lqf.current.chapter2.threadd;

/**
 * Created by sally on 2017/2/17.
 * volatile保证线程的可见性,但并不能给保证其原子性
 */
public class XianVolatile implements Runnable{

    public static volatile int i = 0;
    public void run() {
        for (int k=0;k<10000;k++) {
            i++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10];
        for (int i=0;i<10;i++) {
            threads[i] = new Thread(new XianVolatile());
            threads[i].start();
        }
        //join()等待目标线程的终止
        for (int i=0;i<10;i++) {
            threads[i].join();
        }
        System.out.println(i);
    }
}
