class Solution_Approach1 {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;

        String numString = String.valueOf(x);
        for( int p1 =0, p2=numString.length()-1 ; p1<p2; p1++,p2--){
            if(numString.charAt(p1)!=numString.charAt(p2))
                return false;            
        }
        return true;
    }   
 }

class Solution_Approach2{
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

