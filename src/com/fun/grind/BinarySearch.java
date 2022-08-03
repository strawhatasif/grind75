package com.fun.grind;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};

        System.out.println(search(nums, 9));
    }

    protected static int search(int[] numbers, int target) {
        //The length of numbers is 0! Nothing to search.
        if (numbers.length == 0) return -1;

        //Beginning and ending variables
        int left = 0;
        int right = numbers.length-1;

        while (left <= right) {
            int middle = left + (right-left) / 2;

            //Check if the target is in the middle
            if (numbers[middle] == target) {
                return middle;
            }
            else if (numbers[middle] > target) {
                //Since we know that the middle value is larger than the target, reduce the right side.
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }

        return -1;
    }
}
