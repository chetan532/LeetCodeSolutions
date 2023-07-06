// 137. Single Number II


// Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

 

// Example 1:

// Input: nums = [2,2,3,2]
// Output: 3
// Example 2:

// Input: nums = [0,1,0,1,0,1,99]
// Output: 99

class SingleNumberII {
    public static int singleNumber(int[] nums) {

        int once = 0;
        int twice = 0;
        int thrice = 0;
        for (int i = 0; i < nums.length; i ++){
            twice = twice | ( once & nums[i]);
            once = once ^ nums[i];
            thrice = once & twice;
            once = once & (~thrice);
            twice = twice & (~thrice);
        }
        return once;
        
    }

    public static void main(String[] args) {
        int[] array1 = {2,2,3,2};
        System.out.println(singleNumber(array1));

        int[] array2 = {0,1,0,1,0,1,99};
        System.out.println(singleNumber(array2));
    }
}
