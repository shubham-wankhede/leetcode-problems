/**
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?
 
Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 

Constraints:
1 <= k <= nums.length <= 105
-104 <= nums[i] <= 104
 */
class Solution {
    public int findKthLargest(int[] nums, int k) {
       return quickSelect(nums, 0, nums.length-1, k);
    }

    public int quickSelect(int[] nums, int start, int end, int k){
        //create partition
        int pivot = start;
        for(int i=start ; i<end ;  i++){
            if(nums[i]<nums[end])
                swap(nums,i,pivot++);
        }
        swap(nums,end,pivot);

        //get the count from last place
        int count = end - pivot +1;

        if(k==count)
            return nums[pivot];
        else if(k>count)
            return quickSelect(nums, start, pivot-1, k - count);
        else
            return quickSelect(nums, pivot+1, end, k);
        
    }

    public void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

}
