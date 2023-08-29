class Solution {
    public int strStr(String haystack, String needle) {
        int start = 0 ;
        for(int i=start, n=0; i<haystack.length();){
            if(haystack.charAt(i)==needle.charAt(n))
                  if(n == needle.length()-1)
                        return i - n;
                  else{
                        i++;
                        n++;
                  }

            else{
                  i = ++start;
                  n=0;
            }
        }
        return -1;
    }
}
