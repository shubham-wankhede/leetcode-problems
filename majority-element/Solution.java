class Solution {
    public int majorityElement(int[] nums) {
          int count = 0;
          int eligible = 0;
          for (int num : nums){
                if(count == 0)
                  eligible = num ;
            
                if(num == eligible)
                  count ++;
                else
                  count--;
          }

          return eligible;

    }

    public int majorityElement_Arrays(int[] nums){
      Arrays.sort(nums);
      return nums[nums.length-1/2];
    }

}
