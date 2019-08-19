package com.na;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Author：TaiLong
 * created:2019/8/19
 */
public class Sum {
    public static void main(String[] args) {
Sum sum=new Sum();

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
