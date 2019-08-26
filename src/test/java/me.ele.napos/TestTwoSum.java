package me.ele.napos;

import me.ele.napos.leetcode.TwoSum;

import java.util.Arrays;

/**
 * Created by jakoo on 2019/8/26.
 */
public class TestTwoSum {
    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 15;

        int target = 9;


        TwoSum ts = new TwoSum();
        int[] arr = ts.twoSum(nums, target);
        System.out.println(Arrays.toString(arr));
    }
}
