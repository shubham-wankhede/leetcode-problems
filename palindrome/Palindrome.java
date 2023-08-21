class Palindrome_Approach1 {
    public boolean isPalindrome(int x) {
       String originalX = String.valueOf(x);

       String[] splittedX = originalX.split("");
       StringBuilder reversed = new StringBuilder("");
       for(int i=splittedX.length-1; i>=0; i--){
           reversed.append(splittedX[i]);
       }

       String reversedString = new String(reversed);

       return originalX.equals(reversedString) ? true : false;
    }
}


class Palindrome_Approach2{
    public boolean isPalindrome(int x) {
        if( x < 0 )
            return false;

        int tempX = x;
        int reversedX = 0;

        while(tempX>0){
            int lastDigit = tempX % 10 ;
            reversedX = reversedX * 10 + lastDigit;
            tempX = tempX/10;
        }

        return x == reversedX ? true : false;
    }
}

