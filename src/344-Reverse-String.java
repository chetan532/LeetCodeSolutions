// 344. Reverse String

// Write a function that reverses a string. The input string is given as an array of characters s.

// You must do this by modifying the input array in-place with O(1) extra memory.


// Example 1:

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]
// Example 2:

// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]

import java.util.Arrays;

class ReverseString {
    
    public static char[] reverseString(char[] s) {
        
        int l = 0, r = s.length - 1;
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }

        return s;

    }

    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(reverseString("Hello".toCharArray())));
        System.out.println(Arrays.toString(reverseString("Hannah".toCharArray())));

    }

}
