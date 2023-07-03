// 1662. Check If Two String Arrays are Equivalent

// Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

// A string is represented by an array if the array elements concatenated in order forms the string.

 

// Example 1:

// Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
// Output: true
// Explanation:
// word1 represents string "ab" + "c" -> "abc"
// word2 represents string "a" + "bc" -> "abc"
// The strings are the same, so return true.
// Example 2:

// Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
// Output: false
// Example 3:

// Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
// Output: true

class CheckIfTwoStringArrays {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

         StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for(String string1:word1) {
            s1.append(string1);
        }

         for(String string2:word2) {
            s2.append(string2);
        }

        String a= s1.toString();
        String b= s2.toString();
        return a.equals(b);
        
    }

    public static void main(String[] args) {
        
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(word1,word2));

        String[] word3 = {"a", "cb"};
        String[] word4 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(word3,word4));

        String[] word5 = {"abc", "d", "defg"};
        String[] word6 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word5,word6));

    }
}
