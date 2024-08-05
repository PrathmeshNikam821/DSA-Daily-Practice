/*
 * 
 * 
 * Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 */

import java.util.*;
public class MaxSubArray {
   
    public int maxSubArray(int[] nums) {
        int GlobalMax = nums[0];
        int CurrMax = nums[0];

        for(int i = 1; i<nums.length ; i++){
            CurrMax = Math.max(nums[i] , nums[i]+CurrMax);


            if(CurrMax > GlobalMax){
            GlobalMax = CurrMax ; 
        }
        }

        
        return GlobalMax ;
    }

     
}

