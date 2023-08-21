
class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character,Integer> romans = getRomans();
        int sum = 0;

        for(int i=0; i<s.length()-1; i++){
            char currentRoman = s.charAt(i);
            char nextRoman = s.charAt(i+1);
            if(romans.get(currentRoman)< romans.get(nextRoman))
                sum -= romans.get(currentRoman);
            else
                sum += romans.get(currentRoman);
        }

        return sum + romans.get(s.charAt(s.length()-1));
    }

    public Map<Character, Integer> getRomans(){
        HashMap<Character,Integer> romans = new HashMap<>();
        romans.put('I',1);
        romans.put('V',5);
        romans.put('X',10);
        romans.put('L',50);
        romans.put('C',100);
        romans.put('D',500);
        romans.put('M',1000);
        return romans;
    }
    
}
