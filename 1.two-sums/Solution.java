//https://github.com/shubham-wankhede/leetcode-problems.git

class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        HashMap<Integer, Integer> lookup = new HashMap<>();
        for(int i=0 ; i<length ; i++){
          int diff = target-nums[i];
          if( lookup.get(diff) != null )
            return new int[]{lookup.get(diff),i};
          else
            lookup.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
