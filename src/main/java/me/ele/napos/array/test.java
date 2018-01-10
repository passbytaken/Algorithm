package me.ele.napos.array;

/**
 * Created by jakoo on 10/01/2018.
 */
public class test {
    public static void main(String[] args) {
        char a = 'a';
        int b = 98;

        System.out.println(false?b:a);
        System.out.println(false?a:b);
        System.out.println(false?98:a);
        System.out.println(false?a:98);

        Object t = false? 1234.1:98;

        if(t instanceof Double) {
            System.out.println("char:" + t);
        }else {
            System.out.println("int:" + t);
        }

        int i = 0;
        for (int j = 0; j<5; j++) {
            //i++;
            i = i++;
        }
        System.out.println(i);

    }




}

