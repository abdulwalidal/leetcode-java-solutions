/*
Flow:
1. Outer loop picks the first number.
2. Inner loop pairs it with every number that comes after.
3. If any pair sum equals the target → return those indices.
4. If no pair matches, move to the next outer number.
5. If no pair found at all → return empty array.
leetcode question link
https://leetcode.com/problems/two-sum
*/

import java.util.Arrays;

public class Solution {

      public static int[] twoSum(int[] nums, int target) {
        // [2,7,11,15], target = 9
        for(int i = 0;i<nums.length;i++) { // pick one number (nums[i]) at a time
         for(int j = i+1;j<nums.length;j++) { // try pairing nums[i] with every number that comes after it
            if(nums[i] + nums[j] == target) {  // If the two numbers add up to the target, return their indices
                return new int[] {i,j}; // if the pair is found, return their indexes 
            }
         }  
         // Inner loop ends here (means no pair found for current i)
         // Now outer loop will move to the next i
        }

        return new int[] {}; // If no pair adds up to the target, return an empty array
        
}
    
    
    public static void main(String[] args) {
     int[] nums = {2,7,11,15};
     System.out.println(Arrays.toString(Solution.twoSum(nums, 9)));

        
    
    }
    
}
