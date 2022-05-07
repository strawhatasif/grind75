package com.fun.grind;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        var intArray = new int[]{3,2,4};
        var target = 6;

        var sum = twoSum(intArray, target);

        System.out.println(sum[0] + " " + sum[1]);
    }

    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * You can return the answer in any order.
     */
    public static int[] twoSum(int[] nums, int target) {
       var indices = new int[2];
       var differenceMap = new HashMap<Integer, Integer>();

        for (int i=0; i<nums.length; i++) {
           //The difference map contains numbers that add up to the target
           if (differenceMap.containsKey(nums[i])) {
               indices[0] = differenceMap.get(nums[i]);
               indices[1] = i;
           }

           //If the difference does not exist in the differenceMap, put it and the associated index, in the map.
           differenceMap.put(target-nums[i], i);

        }
        return indices;
    }
}
