package me.ele.napos.math;

/**
 * Created by jakoo on 18/01/2018.
 */
public class CollatzConjecture {
    public static void main(String[] args) {
        int sum = 9;
        Collatz(sum);
    }
    public static int Collatz(int sum) {
        if (sum == 1) {
            return 1;
        }
        if (isEvenNum(sum)) {
            sum = evenHandle(sum);
        } else {
            sum = oddHandle(sum);
        }
        System.out.println(sum);
        sum = Collatz(sum);
        return sum;
    }
    public static boolean isEvenNum(int sum) {
        if (sum % 2 == 0) {
            return true;
        } else
            return false;
    }
    public static int evenHandle(int sum) {
        sum/=2;
        return sum;
    }
    public static int oddHandle(int sum) {
        sum = sum*3+1;
        return sum;
    }


}
