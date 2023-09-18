/**
Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.

 

Example 1:

Input: n = 27
Output: true
Explanation: 27 = 33
Example 2:

Input: n = 0
Output: false
Explanation: There is no x where 3x = 0.
Example 3:

Input: n = -1
Output: false
Explanation: There is no x where 3x = (-1).


Solution : since we have to find k from 3^k from result

3^k = n

simplifying it is k = log(n)/log(3)

and if it's completely divisible it will result whole number
which we can identify by using %1 

*/

class Solution {
    public boolean isPowerOfThree(int n) {
       return Math.log10(n)/Math.log10(3)%1==0;
    }
}
