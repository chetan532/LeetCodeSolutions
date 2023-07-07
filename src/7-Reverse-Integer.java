// 7. Reverse Integer

// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

// Example 1:

// Input: x = 123
// Output: 321

// Example 2:

// Input: x = -123
// Output: -321

// Example 3:

// Input: x = 120
// Output: 21


class ReverseInteger {
    
    public static int reverse(int x) {
        long sum=0;
        int k=x;
        if(x<0)
            k=(-1)*k;
        while(k>0){
            sum=sum*10+x%10;
            x=x/10;
            k=k/10;
        }
    
        if(sum <Math.pow(-2,31) || sum > Math.pow(2,31)) {
            return 0;
        }else {
            return (int)sum; 
        }
        
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
    }

}
