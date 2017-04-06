package me.ele.napos.arraylist;

import java.util.ArrayList;

/**
 * Created by jakoo on 31/03/2017.
 *
 * ArrayList存储字符串并遍历，要求加入泛型，并用增强for遍历
 * Normal for
 * Enhance for
 *
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Hello");
        list.add("World");
        list.add("and");
        list.add("fuck off");
        list.add("you");
        list.add("dumb");
        list.add("ass");


        System.out.println("----------Normal----------");


        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        System.out.println("----------Enhance----------");

        for (String s : list) {
            System.out.println(s);
        }

    }


}
