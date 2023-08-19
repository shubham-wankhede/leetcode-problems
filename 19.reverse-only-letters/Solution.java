/**
Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

Example 1:
Input: s = "ab-cd"
Output: "dc-ba"

Example 2:
Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"

Example 3:
Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!" 

Constraints:
1 <= s.length <= 100
s consists of characters with ASCII values in the range [33, 122].
s does not contain '\"' or '\\'.
 */

class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int p1 = 0;
        int p2 = s.length()-1;
        int i=0;
        while(p1<p2){
            char cStart = s.charAt(p1);
            char cEnd = s.charAt(p2);
            if(!Character.isLetter(cStart))
                p1++;
            else if(!Character.isLetter(cEnd))
                p2--;
            else{
                sb.setCharAt(p1++,cEnd);
                sb.setCharAt(p2--,cStart);
            }
        }
        return sb.toString();
    }
}
