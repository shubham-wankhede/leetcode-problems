/**
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order. 

Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:
Input: s = "God Ding"
Output: "doG gniD"
 

Constraints:
1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.
 */

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s.trim());
        int r=0;
        int l=0;
        for(int i = 0; i<s.length() ; i++){
            if(i==s.length()-1)
                reverse(sb,l,r);
            else if(s.charAt(i) != ' ')
                r++;
            else {
                reverse(sb,l,r-1);
                l = r+1;
                r = l;
            }
        }
        return sb.toString();
    }

    public void reverse(StringBuilder sb, int start, int end){
        while(start<end){
            char temp = sb.charAt(start);
            sb.setCharAt(start++, sb.charAt(end));
            sb.setCharAt(end--, temp);
        }
    }
}
