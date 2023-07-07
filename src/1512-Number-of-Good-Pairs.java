// 1512. Number of Good Pairs

// Given an array of integers nums, return the number of good pairs.

// A pair (i, j) is called good if nums[i] == nums[j] and i < j.

 

// Example 1:

// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

// Example 2:

// Input: nums = [1,1,1,1]
// Output: 6
// Explanation: Each pair in the array are good.

// Example 3:

// Input: nums = [1,2,3]
// Output: 0

class NumberofGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        
        int out = 0;

        for(int i =0;i<nums.length;i++) {

            for(int j = i+1;j<nums.length;j++) {

                if(nums[i] == nums[j]) {

                    out++;

                }

            }

        }

        return out;

    }

    public static void main(String[] args) {
        
        int[] array1 = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(array1));

        int[] array2 = {1,1,1,1};
        System.out.println(numIdenticalPairs(array2));

        int[] array3 = {1,2,3};
        System.out.println(numIdenticalPairs(array3));
    }
}
