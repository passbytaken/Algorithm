package me.ele.napos.sort;

import java.util.Arrays;

/**
 * Created by jakoo on 2020/7/31.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] values = {3, 1, 6, 2, 9, 0, 7, 4, 5, 8};
        bubbleSort(values);
        System.out.println(Arrays.toString(values));
    }

//    public static void bubbleSort(int[] values) {
//        int temp;
//        for (int i = 0; i < values.length; i++) {
//            for (int j = 0; j < values.length-1-i; j++) {
//                if (values[j] > values[j + 1]) {
//                    temp = values[j];
//                    values[j] = values[j + 1];
//                    values[j + 1] = temp;
//                }
//            }
//        }
//    }

    public static void bubbleSort(int[] values) {
        int temp;

        for (int i = 0;i < values.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < values.length - 1 -i; j++) {
                if (values[j] > values[j+1]) {
                    temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;

                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }
}
