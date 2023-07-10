
// 2733. Neither Minimum nor Maximum

// Given an integer array nums containing distinct positive integers, find and return any number from the array that is neither the minimum nor the maximum value in the array, or -1 if there is no such number.

// Return the selected integer.

 

// Example 1:

// Input: nums = [3,2,1,4]
// Output: 2
// Explanation: In this example, the minimum value is 1 and the maximum value is 4. Therefore, either 2 or 3 can be valid answers.
// Example 2:

// Input: nums = [1,2]
// Output: -1
// Explanation: Since there is no number in nums that is neither the maximum nor the minimum, we cannot select a number that satisfies the given condition. Therefore, there is no answer.
// Example 3:

// Input: nums = [2,1,3]
// Output: 2
// Explanation: Since 2 is neither the maximum nor the minimum value in nums, it is the only valid answer.

import java.util.Arrays;

class NeitherMinimumnorMaximum {
    
    public static int findNonMinOrMax(int[] nums) {
        
        if(nums.length > 2) {

            Arrays.sort(nums);

            return nums[1];

        }else {
            return -1;
        }

    }

    public static void main(String[] args) {
        
        int[] array1 = {3,2,1,4};
        System.out.println(findNonMinOrMax(array1));

        int[] array2 = {1,2};
        System.out.println(findNonMinOrMax(array2));

        int[] array3 = {2,1,3};
        System.out.println(findNonMinOrMax(array3));

    }

}
