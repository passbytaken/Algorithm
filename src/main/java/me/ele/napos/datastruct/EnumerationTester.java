package me.ele.napos.datastruct;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by jakoo on 20/04/2017.
 */
public class EnumerationTester {

    public static void main(String[] args) {
        Enumeration days;

        Vector dayname = new Vector();

        dayname.add("Sun");
        dayname.add("Mon");
        dayname.add("Tue");
        dayname.add("Wed");
        dayname.add("Thu");
        dayname.add("Fri");
        dayname.add("Sat");

        days = dayname.elements();

        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }
}
