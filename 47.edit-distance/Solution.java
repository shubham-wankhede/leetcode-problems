/**

72. Edit Distance
Medium
Topics
Companies
Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.

You have the following three operations permitted on a word:

Insert a character
Delete a character
Replace a character
 

Example 1:

Input: word1 = "horse", word2 = "ros"
Output: 3
Explanation: 
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')
Example 2:

Input: word1 = "intention", word2 = "execution"
Output: 5
Explanation: 
intention -> inention (remove 't')
inention -> enention (replace 'i' with 'e')
enention -> exention (replace 'n' with 'x')
exention -> exection (replace 'n' with 'c')
exection -> execution (insert 'u')
 

Constraints:

0 <= word1.length, word2.length <= 500
word1 and word2 consist of lowercase English letters.
 */

class Solution {
    	public int minDistance(String word1, String word2) {
        return minDist(0,0,word1,word2);  
    }
    private int minDist(int p1, int p2, String word1, String word2) {
        int s1=word1.length(),s2=word2.length();
        if(p1==s1) return s2-p2; //We only edit word1, but since both insert and delete are allowed, word1 may not finish first
        if(p2==s2) return s1-p1; //The two ternimation checks make sure both indexes are valid
        if(word1.charAt(p1)==word2.charAt(p2)) 
            return minDist(p1+1,p2+1,word1,word2);
        int ins = minDist(p1,p2+1,word1,word2);
        int del = minDist(p1+1,p2,word1,word2);
        int rep = minDist(p1+1,p2+1,word1,word2);
        return Math.min(ins, Math.min(del, rep))+1;
    }
}
}
