/**
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
 */

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int num : nums){
            ans ^= num;
        }
        return ans;
    }
}

/**
Solution :

we know 
 a XOR 0 = a
 a XOR a = 0
 and XOR is associated like addition and hence order does not matter
 we can chain the XCR accross all elements to eliminate duplicates (since it's mentioned in question that we have numbers in pair and only one unique) and
 getting unique

 */
