/*
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */



public class RotateArray{

    public void rotate(int nums[] ,int m ,int  n){
        int start = m ;
        int end = n ;

        while(end>=start){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp ;

            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {

     int len = nums.length ;
     k = k % len ;
    rotate(nums , 0 , nums.length-1);
    rotate(nums , 0 , k-1);
    rotate(nums , k, nums.length-1);
    }
}