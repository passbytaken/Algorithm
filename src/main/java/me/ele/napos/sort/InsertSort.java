package me.ele.napos.sort;

/**
 * Created by jakoo on 24/05/2017.
 *
 */
public class InsertSort {
    public void insertSort(int[] a) {

        int length = a.length;
        int insertNum;

        for (int i = 1; i < length; i++) {
            insertNum = a[i];
            int j = i-1;
            while (j >= 0 && a[j] > insertNum) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = insertNum;
        }



    }
}
