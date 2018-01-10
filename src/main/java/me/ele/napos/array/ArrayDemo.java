package me.ele.napos.array;

/**
 * Created by jakoo on 05/12/2017.
 */
public class ArrayDemo {

    public static void main(String[] args) {
        int[] array = new int[10];

        array[0] = 100;
        // initialize second element
        array[1] = 200;
        // and so forth
        array[2] = 300;
        array[3] = 400;
        array[4] = 500;
        array[5] = 600;
        array[6] = 700;
        array[7] = 800;
        array[8] = 900;
        array[9] = 1000;


        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);

        }




    }
}
