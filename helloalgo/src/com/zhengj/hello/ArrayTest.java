package com.zhengj.hello;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayTest {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 9, 11, 212, 5678224};
        System.out.println(randomAccess(nums));
        insert(nums, 99, 2);
        System.out.println(Arrays.toString(nums));
        remove(nums, 5);
        System.out.println(Arrays.toString(nums));
    }

    private static int randomAccess(int[] nums) {

        int randomIndex = ThreadLocalRandom.current().nextInt(0, nums.length);
        System.out.println(randomIndex);
        int randomNum = nums[randomIndex];
        return randomNum;
    }

    private static void insert(int[] nums, int num, int index) {

        for (int i = nums.length - 1; i > index; i--) {
            nums[i] = nums[i - 1];
        }
        nums[index] = num;
    }

    static void remove(int[] nums, int index) {
        // 把索引 index 之后的所有元素向前移动一位
        for (int i = index; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
    }

    /* 遍历数组 */
    void traverse(int[] nums) {
        int count = 0;
        // 通过索引遍历数组
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
        }
        // 直接遍历数组元素
        for (int num : nums) {
            count += num;
        }
    }
}
