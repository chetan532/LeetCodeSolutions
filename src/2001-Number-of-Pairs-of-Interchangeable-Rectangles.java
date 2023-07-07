// 2001. Number of Pairs of Interchangeable Rectangles

// You are given n rectangles represented by a 0-indexed 2D integer array rectangles, where rectangles[i] = [widthi, heighti] denotes the width and height of the ith rectangle.

// Two rectangles i and j (i < j) are considered interchangeable if they have the same width-to-height ratio. More formally, two rectangles are interchangeable if widthi/heighti == widthj/heightj (using decimal division, not integer division).

// Return the number of pairs of interchangeable rectangles in rectangles.

 
// Example 1:

// Input: rectangles = [[4,8],[3,6],[10,20],[15,30]]
// Output: 6
// Explanation: The following are the interchangeable pairs of rectangles by index (0-indexed):
// - Rectangle 0 with rectangle 1: 4/8 == 3/6.
// - Rectangle 0 with rectangle 2: 4/8 == 10/20.
// - Rectangle 0 with rectangle 3: 4/8 == 15/30.
// - Rectangle 1 with rectangle 2: 3/6 == 10/20.
// - Rectangle 1 with rectangle 3: 3/6 == 15/30.
// - Rectangle 2 with rectangle 3: 10/20 == 15/30.

// Example 2:

// Input: rectangles = [[4,5],[7,8]]
// Output: 0
// Explanation: There are no interchangeable pairs of rectangles.

import java.util.HashMap;

class NumberofPairsofInterchangeableRectangles {
    
    public static long interchangeableRectangles(int[][] rectangles) {
        
        long count=0;

        HashMap<Double,Long> hm = new HashMap<>();
        for( int i=0;i<rectangles.length;i++){
             
            double d1 =(double)rectangles[i][0]/rectangles[i][1]; 

            long val = (long)hm.getOrDefault(d1,0L);
            count= count+val;
            hm.put(d1,val+1);

        }
        return count;

    }


    public static void main(String[] args) {
        
        int[][] matrix = {{4,8},{3,6},{10,20},{15,30}};

        System.out.println(interchangeableRectangles(matrix));


        int[][] matrix1 = {{4,5},{7,8}};

        System.out.println(interchangeableRectangles(matrix1));


    }

}
