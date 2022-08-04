package com.fun.grind;

public class MaximumSubArray {
    public static void main(String[] args) {
        var nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    protected static int maxSubArray(int[] nums) {
        var maximumSum = nums[0];
        int currentSum = maximumSum;
        //Iterate through input array and set current sum equal to
        //the maximum between the current value + index and current value
        for (int i=1; i<nums.length; i++) {
            currentSum = Math.max(nums[i] + currentSum, nums[i]);
            maximumSum = Math.max(currentSum, maximumSum);
        }

        return maximumSum;
    }
}
