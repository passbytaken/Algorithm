package me.ele.napos.Utils;

import java.util.regex.Pattern;

/**
 * Created by jakoo on 27/07/2017.
 */
public class StringUtils {
    public String DoubleToString(double num) {
        return String.valueOf(num);
    }


    public static int WordCount(String str) {
        Pattern p = Pattern.compile("\\W{1,}");
        String[] strs = p.split(str);
        for (String s : strs) {
            System.out.println(s);
        }
        return strs.length;
    }
}
