// 4. Median of Two Sorted Arrays

// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).

 

// Example 1:

// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.

// Example 2:

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

import java.util.Arrays;

class MedianofTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

       int[] newArray = new int[nums1.length+nums2.length];

       int k = 0;

       for(int i =0;i<nums1.length;i++) {
            newArray[k++] =nums1[i];
        }
        for(int i =0;i<nums2.length;i++) {
            newArray[k++] =nums2[i];
        }

        Arrays.sort(newArray);

        int mid = newArray.length/2;
        if(newArray.length%2==0) {
           return (double)(newArray[mid-1] + newArray[mid])/2;
        } 
        return newArray[mid];
        
    }


    public static void main(String[] args) {
        
        int[] array1 = {1,3};
        int[] array2 = {2};
        System.out.println(findMedianSortedArrays(array1,array2));

        int[] array3 = {1,2};
        int[] array4 = {3,4};
        System.out.println(findMedianSortedArrays(array3,array4));

    }
}
