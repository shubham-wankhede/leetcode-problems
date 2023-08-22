class LonestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 )
            return "";
            
        String base = strs[0];
        for(int i=0 ; i<base.length(); i++){
            char prefixChar = base.charAt(i);
            for(int j=1; j<strs.length ; j++){
                String word = strs[j];
                if(i >= word.length() || prefixChar != word.charAt(i))
                    return base.substring(0,i);
            }
        }
        return base;
    }
}

