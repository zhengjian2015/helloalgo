package com.zhengj.hello;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayTest {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6,9,11,212,5678224};
        System.out.println(randomAccess(nums));

    }

    private static int randomAccess(int[] nums) {

        int randomIndex = ThreadLocalRandom.current().nextInt(0,nums.length);
        System.out.println(randomIndex);
        int randomNum = nums[randomIndex];
        return randomNum;
    }
}
