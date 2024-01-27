/**

3. Longest Substring Without Repeating Characters
Solved
Medium
Topics
Companies
Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */

class Solution {
    //brute force
    public  int lengthOfLongestSubstring(String s) {
		int max = 0;
		for(int i = 0; i<s.length(); i++){
			StringBuilder sb = new StringBuilder();
			for(int j= i; j < s.length(); j++){
				if(sb.indexOf(String.valueOf(s.charAt(j))) != -1){
					break;
				}
				sb.append(s.charAt(j));
                if(j==s.length()-1){
					return Math.max(sb.length(),max);
				}
			}
			max = Math.max(sb.length(),max);
		}
		return max;
	}
  //using HashMap
    public static int lengthOfLongestSubstring2(String s) {
		int length = s.length();
		int left = 0;
		int right = 0;
		int maxLength = 0;

		Map<Character,Integer> map = new HashMap<>();

		while(right < length){
			char ch = s.charAt(right);
			if(!map.containsKey(ch) || map.get(ch) < left){
				map.put(ch,right);
				maxLength = Math.max(maxLength,right-left+1);
			}else{
				left = map.get(ch)+1;
				map.put(ch,right);
			}
			right++;
		}
		return maxLength;
	}

	//using hashset
        public static int lengthOfLongestSubstring(String s) {
		int length = s.length();
                int maxLength = 0;
                int left = 0;

                Set<Character> set = new HashSet<>();

                for(int right = 0; right < length; right++){
                    char ch = s.charAt(right);
                    if(!set.contains(ch)){
                      set.add(ch);
                      maxLength = Math.max(maxLength, right-left+1);
                    }else{
                       while(set.contains(ch)){
                         set.remove(s.charAt(left));
                        left++;
                    }
                    set.add(ch);
                }
        }
        return maxLength;
	}
}
