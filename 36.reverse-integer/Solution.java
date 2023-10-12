/**
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21
 

Constraints:
-231 <= x <= 231 - 1
*/

class Solution {
    public int reverse(int x) {
        long rev = 0;

        long temp = Math.abs(x);

        while(temp > 0){
            long last = temp % 10;
            rev = rev * 10 +last;
            temp /=10;
        }

        if(rev > Integer.MAX_VALUE || rev< Integer.MIN_VALUE)
            return 0;

        return x<0 ? (int)-rev : (int)rev;

    }
}
