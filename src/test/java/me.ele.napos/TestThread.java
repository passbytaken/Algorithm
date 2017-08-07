package me.ele.napos;

import me.ele.napos.runnable.RunnableTest;

/**
 * Created by jakoo on 26/06/2017.
 */
public class TestThread {
    public static void main(String[] args) {

        RunnableTest r1 = new RunnableTest("我是线程-1");
        r1.start();
        RunnableTest r2 = new RunnableTest("我是线程-2");
        r2.start();


    }
}
