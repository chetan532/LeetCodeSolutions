// 2418. Sort the People

// You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

// For each index i, names[i] and heights[i] denote the name and height of the ith person.

// Return names sorted in descending order by the people's heights.

 

// Example 1:

// Input: names = ["Mary","John","Emma"], heights = [180,165,170]
// Output: ["Mary","Emma","John"]
// Explanation: Mary is the tallest, followed by Emma and John.
// Example 2:

// Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
// Output: ["Bob","Alice","Bob"]
// Explanation: The first Bob is the tallest, followed by Alice and the second Bob.

import java.util.Arrays;

class SortthePeople {

    public static String[] sortPeople(String[] names, int[] heights) {
        
        for(int i=0; i<names.length; i++){
            for(int j=1+i; j<names.length; j++){
                if(heights[i] < heights[j]){
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;

                    String temp1 = names[i];
                        names[i] = names[j];
                        names[j] = temp1;
                }
            }
        }
        return names;
    }

    public static void main(String[] args) {
        
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};

        System.out.println(Arrays.toString(sortPeople(names,heights)));

        String[] names1 = {"Alice","Bob","Bob"};
        int[] heights1 = {155,185,150};

        System.out.println(Arrays.toString(sortPeople(names1,heights1)));
    }
    
}
