/**
Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.


Example 1:
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.

Example 2:
Input: s = "aba"
Output: false

Example 3:
Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.

Constraints:
1 <= s.length <= 104
s consists of lowercase English letters.

 */

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for(int partition=length/2; partition>=1; partition--){
            if(length%partition==0){
                int parts = length/partition;
                StringBuilder sb = new StringBuilder();
                String partSubstring = s.substring(0,partition);
                for(int i=0; i<parts; i++){
                    sb.append(partSubstring);
                }
                if(sb.toString().equals(s))
                    return true;
            }
        }
        return false;
    }
}
