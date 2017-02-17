package org.lqf.current.chapter2.xinjian;

/**
 * Created by sally on 2017/2/17.
 */
public class XinJianRunnable implements Runnable{
    public static void main(String[] args) {
        Thread t1 = new Thread(new XinJianRunnable());
        t1.start();
    }

    public void run() {
        System.out.println("oh, I am runnable");
    }
}
