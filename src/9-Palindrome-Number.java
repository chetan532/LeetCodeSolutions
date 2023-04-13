
// Given an integer x, return true if x is a 
// palindrome
// , and false otherwise.

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.


// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.


// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

class PalindromeNumber {
    public static void main(String[] args) {

        boolean isPalindrome = isPalindrome(121);
        boolean isPalindrome1 = isPalindrome(-121);
        boolean isPalindrome2 = isPalindrome(10);

        System.out.println(isPalindrome);
        System.out.println(isPalindrome1);
        System.out.println(isPalindrome2);
    }

    public static boolean isPalindrome(int x) {

        String prod = Integer.toString(x);
       if (prod.equals(new StringBuilder(prod).reverse().toString())){
           return true;
       }
       return false;
   }
}
