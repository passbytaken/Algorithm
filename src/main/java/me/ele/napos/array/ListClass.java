package me.ele.napos.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakoo on 14/03/2017.
 */
public class ListClass {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Hello");
        list.add("Hello");
        list.add("World");
        list.add("hahahahah");

        for (String str : list) {
            System.out.println(str);
        }

        String[] array = new String[list.size()];

        list.toArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }







    }
}
