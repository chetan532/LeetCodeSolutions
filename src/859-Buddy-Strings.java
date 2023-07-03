
// Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.

// Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

// For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 

// Example 1:

// Input: s = "ab", goal = "ba"
// Output: true
// Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
// Example 2:

// Input: s = "ab", goal = "ab"
// Output: false
// Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.
// Example 3:

// Input: s = "aa", goal = "aa"
// Output: true
// Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.

class BuddyStrings {
    public static boolean buddyStrings(String str, String goal) {

        if (str.length() != goal.length()) {
            return false;
        }
        if (str.equals(goal)) {
            int[] frequency = new int[26];
            for (char ch : str.toCharArray()) {
                frequency[ch - 'a']++;
                if (frequency[ch - 'a'] == 2) {
                    return true;
                }
            }
            return false;
        }
        int f = -1;
        int s = -1;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != goal.charAt(i)) {
                if (f == -1) {
                    f = i;
                } 
                else if (s == -1) {
                    s = i;
                } 
                else {
                    return false;
                }
            }
        }
        if (s == -1) {
            return false;
        }
        boolean ans = str.charAt(f) == goal.charAt(s) && str.charAt(s) == goal.charAt(f);
        return ans;
        
    }

    public static void main(String[] args) {
        System.out.println(buddyStrings("ab","ba"));
        System.out.println(buddyStrings("ab","ab"));
        System.out.println(buddyStrings("aa","aa"));
    }
}
