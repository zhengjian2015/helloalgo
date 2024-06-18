package com.zhengj.jz1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * 剑指offer第1题
 */
public class Solution1 {
    public static void main(String[] args) {
        int[] res = {2,3,1,0,2,5,3};
        System.out.println(new Solution1().findRepeatNum(res));
    }

    public int findRepeatNum(int[] nums) {
        if(nums == null) {
            return -1;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return nums[i];
            } else {
                set.add(nums[i]);
            }
        }
        return -1;
    }
}
