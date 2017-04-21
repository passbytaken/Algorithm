package me.ele.napos.datastruct;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by jakoo on 21/04/2017.
 */
public class HashTableDemo {

    public static void main(String[] args) {

        Hashtable hashtable = new Hashtable();
        Enumeration names;

        String str;
        double bal;

        hashtable.put("Zara", new Double(3434.34));
        hashtable.put("Tom", new Double(123.34));
        hashtable.put("Kevin", new Double(344.34));
        hashtable.put("Daisy", new Double(3234.34));
        hashtable.put("Mahnaz", new Double(-34.34));


        names = hashtable.keys();

        while (names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ": " + hashtable.get(str));
        }

        System.out.println();


        bal = ((Double) hashtable.get("Zara")).doubleValue();
        hashtable.put("Zara", new Double(bal+1000));

        System.out.println("zara's new balance: " + hashtable.get("Zara"));

    }
}
