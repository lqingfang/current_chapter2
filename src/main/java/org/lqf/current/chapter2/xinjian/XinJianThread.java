package org.lqf.current.chapter2.xinjian;

import org.junit.Test;

/**
 * Created by sally on 2017/2/17.
 */
public class XinJianThread {
    @Test
    public void test01() {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println("Hello, I am t1");
            }
        };
        t1.start();
    }



}
