package me.ele.napos.generic;

/**
 * Created by jakoo on 21/03/2017.
 *
 */
public class MaximumTest {

    //compare 3 value and rerurn the max
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; //assume x is the  initial max
        if (y.compareTo(max) > 0) {
            max = y; //y is more big
        }
        if (z.compareTo(max) > 0) {
            max = z; //z is more big
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.printf("%d, %d and %d one of the biggest number is %d\n\n", 3, 4, 5, maximum(3, 4, 5));
        System.out.printf("%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",
                6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));

        System.out.printf("%s, %s 和 %s 中最大的数为 %s\n", "pear",
                "apple", "orange", maximum("pear", "apple", "orange"));
    }

}
