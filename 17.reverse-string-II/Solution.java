/**
Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

Example 1:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"

Example 2:
Input: s = "abcd", k = 2
Output: "bacd"

Constraints:
1 <= s.length <= 104
s consists of only lowercase English letters.
1 <= k <= 104
 */

class Solution {
    public String reverseStr(String s, int k) {
        int length  = s.length();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<length; i=i+2*k ){
            int p1 = i;
            int p2 = Math.min(p1+k-1,length-1);
            while(p1<p2){
                 char temp = s.charAt(p1);
                 sb.setCharAt(p1++, s.charAt(p2));
                 sb.setCharAt(p2--, temp);
             }
        }
        return sb.toString();
    }
}
