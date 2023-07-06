// Given an array of positive integers nums and a positive integer target, return the minimal length of a 
// subarray
//  whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

// Example 1:

// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.
// Example 2:

// Input: target = 4, nums = [1,4,4]
// Output: 1
// Example 3:

// Input: target = 11, nums = [1,1,1,1,1,1,1,1]
// Output: 0


class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int i = 0; int j = 0;
        int sum = 0; int ans = 1000000;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>=target){
                ans = Math.min(ans, j-i+1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        
        return ans==1000000?0:ans;
    }

    public static void main(String[] args) {
        
        int[] array1 = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,array1));

        int[] array2 = {1,4,4};
        System.out.println(minSubArrayLen(4,array2));

        int[] array3 = {1,1,1,1,1,1,1,1};
        System.out.println(minSubArrayLen(11,array3));

    }
}
