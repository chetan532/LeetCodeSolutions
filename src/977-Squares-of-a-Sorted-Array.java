// 977. Squares of a Sorted Array

// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

// Example 1:

// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].
// Example 2:

// Input: nums = [-7,-3,2,3,11]
// Output: [4,9,9,49,121]

import java.util.Arrays;

class SquaresofaSortedArray {
    public static int[] sortedSquares(int[] nums) {
        
        int[] newArray = new int[nums.length];
        for(int i = 0;i<nums.length;i++) {

            newArray[i] = nums[i]*nums[i];

        }

        Arrays.sort(newArray);

        return newArray;

    }

    public static void main(String[] args) {
        
        int[] array1 = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(array1)));

        int[] array2 = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(array2)));

    }
}
