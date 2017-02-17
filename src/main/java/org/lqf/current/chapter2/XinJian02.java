package org.lqf.current.chapter2;

/**
 * Created by sally on 2017/2/17.
 */
public class XinJian02 implements Runnable{
    public static void main(String[] args) {
        Thread t1 = new Thread(new XinJian02());
        t1.start();
    }

    public void run() {
        System.out.println("oh, I am runnable");
    }
}
