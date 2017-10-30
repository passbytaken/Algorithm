package me.ele.napos.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jakoo on 13/10/2017.
 */
public class Demo {

    public static void main(String[] args) {
        List<List<String>> fatherlist = new LinkedList();
        List<String> childlist = new ArrayList<>();

        childlist.add("before add child list");
        fatherlist.add(childlist);
        childlist.add("after add child list");

        System.out.println(fatherlist);
    }



}
