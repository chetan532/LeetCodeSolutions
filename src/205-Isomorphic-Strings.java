// 205. Isomorphic Strings

// Given two strings s and t, determine if they are isomorphic.

// Two strings s and t are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

// Example 1:

// Input: s = "egg", t = "add"
// Output: true
// Example 2:

// Input: s = "foo", t = "bar"
// Output: false
// Example 3:

// Input: s = "paper", t = "title"
// Output: true

import java.util.*;

class IsomorphicStrings {
    
    public static boolean isIsomorphic(String s, String t) {
        Map m = new HashMap();
        for (Integer i=0; i<s.length(); ++i)
			if (m.put(s.charAt(i), i) != m.put(t.charAt(i)+"", i)) return false;
        return true;
    }

    public static void main(String[] args) {
        
        System.out.println(isIsomorphic("egg","add"));
         System.out.println(isIsomorphic("foo","bar"));
          System.out.println(isIsomorphic("paper","title"));

    }

}
