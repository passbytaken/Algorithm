package me.ele.napos.runnable;

/**
 * Created by jakoo on 27/06/2017.
 */
public class ThreadTest extends Thread {
    private Thread thread;
    private String threadName;


    public ThreadTest(String name) {
        threadName = name;
        System.out.println("Creating... " + threadName);
    }

    public void run() {

        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread.. "  + threadName + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread" + threadName + "interrupted.");
        }
        System.out.println("Thread " + threadName + "exiting.");

    }

    public void start() {
        System.out.println("starting... " + threadName);

        if (thread == null) {
            thread = new Thread(this,threadName);
            thread.start();
        }

    }
}
