package me.ele.napos.scheduleJob;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by jakoo on 09/03/2018.
 */
public class JobTest {
    public static void main(String[] args) {
        new JobThread().start();
    }
}

class JobThread extends Thread {
    public void run() {
        while (true) {





            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
            String t = sdf.format(new Date());

            System.out.println(t);

            System.out.println("Test: " + Calendar.getInstance().getTime());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
