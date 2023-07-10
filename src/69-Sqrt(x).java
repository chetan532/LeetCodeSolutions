// 69. Sqrt(x)

// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

// You must not use any built-in exponent function or operator.

// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 

// Example 1:

// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2, so we return 2.
// Example 2:

// Input: x = 8
// Output: 2
// Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.


class Sqrtx {
    
    public static int mySqrt(int x) {
        int low = 1 , high = x  , ans = 0;

        while (low <= high){
            int mid = low + (high - low) /2;

            if (x/mid == mid) return mid;
            else if (x/mid < mid)  high = mid-1;
            else {
                low= mid + 1; ans=mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
    }

}
