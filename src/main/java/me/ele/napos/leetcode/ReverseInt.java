package me.ele.napos.leetcode;

/**
 * Created by jakoo on 2019/8/31.
 */
public class ReverseInt {
    public int reverse(int x) {
        long n = 0;
        int of = ((1 << 31) -1) / 10;
        while (x != 0) {

            if (Math.abs(n) > of) return 0;
            n = n * 10 + x % 10;
            x /= 10;
        }
        return (int)n;
    }

    public static void main(String[] args) {
        ReverseInt reverseInt = new ReverseInt();
        int y = reverseInt.reverse(-123);
        System.out.println(y);
    }
}


//解题思路：
//        算法思路： 为对当前数取对 1010 的余数，再一项项填入res尾部，即可完成 intint 翻转。
//        边界情况处理： intint 取值范围为 [-2^{31}, 2^{31} - 1][−2
//        31
//        ,2
//        31
//        −1] ，如果翻转数字溢出，则立即返回 00 。
//        Python： 存储数字理论上是无限长度，因此每次计算完后判断res与of的大小即可；
//        Java： 数字计算会溢出，因此要判断res和of / 10的大小关系（即确定再添 11 位一定会溢出）。
//        Python的坑： 由于Python的 // 操作是向下取整，导致正负数取余 % 操作结果不一致，因此需要将原数字转为正数操作。

