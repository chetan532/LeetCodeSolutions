// Given an unsorted integer array nums, return the smallest missing positive integer.

// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

 

// Example 1:

// Input: nums = [1,2,0]
// Output: 3
// Explanation: The numbers in the range [1,2] are all in the array.
// Example 2:

// Input: nums = [3,4,-1,1]
// Output: 2
// Explanation: 1 is in the array but 2 is missing.
// Example 3:

// Input: nums = [7,8,9,11,12]
// Output: 1
// Explanation: The smallest positive integer 1 is missing.

class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {

        int returnNum = 0;

        for(int d = 0;d<nums.length;d++) {
            if(nums[d] == 1) {
                returnNum = 1;
                break;
            }
        }
        
        if (returnNum == 0)
            return (1);

        for (int i = 0; i < nums.length; i++)
        if (nums[i] <= 0 || nums[i] > nums.length)
            nums[i] = 1;

        for (int i = 0; i < nums.length; i++)
            nums[(nums[i] - 1) % nums.length] += nums.length;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] <= nums.length)
                return (i + 1);

        return (nums.length + 1);       
        
    }

    public static void main(String[] args) {

        int[] first = {1,2,0};
        int[] second = {3,4,-1,1};
        int[] third = {7,8,9,11,12};
        System.out.println(firstMissingPositive(first));
        System.out.println(firstMissingPositive(second));
        System.out.println(firstMissingPositive(third));
    }
}