package com.zhengj.hello;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayTest {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6,9,11,212,5678224};
        System.out.println(randomAccess(nums));
        insert(nums,99,2);
        System.out.println(Arrays.toString(nums));
    }

    private static int randomAccess(int[] nums) {

        int randomIndex = ThreadLocalRandom.current().nextInt(0,nums.length);
        System.out.println(randomIndex);
        int randomNum = nums[randomIndex];
        return randomNum;
    }

    private static void insert(int[] nums,int num,int index) {

        for(int i = nums.length -1 ; i > index; i--) {
            nums[i] = nums[i-1];
        }
        nums[index] = num;
    }
}
