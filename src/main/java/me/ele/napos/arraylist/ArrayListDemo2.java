package me.ele.napos.arraylist;

import java.util.ArrayList;

/**
 * Created by jakoo on 31/03/2017.
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {

        Person p1 = new Person ();
        Person p2 = new Person ();


        ArrayList<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);




        for (Person p : list) {
            System.out.println(p.getName()+ "-" + p.getAge());
        }
    }

}
