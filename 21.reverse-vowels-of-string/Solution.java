/**
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:
Input: s = "hello"
Output: "holle"

Example 2:
Input: s = "leetcode"
Output: "leotcede"
 

Constraints:
1 <= s.length <= 3 * 105
s consist of printable ASCII characters.

 */

class Solution {
    public String reverseVowels(String s) {
        int p1 = 0;
        int p2 = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while(p1<p2){
            char cBegin = s.charAt(p1);
            char cEnd = s.charAt(p2);
            if(isVowel(cBegin) && isVowel(cEnd)){
                sb.setCharAt(p1, cEnd);
                sb.setCharAt(p2, cBegin);
                p1++; p2--;
            }else if(!isVowel(cBegin)){
                p1++;
            }else{
                p2--;
            }
        }
        return sb.toString();
    }

    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c =='U';
    }
}
