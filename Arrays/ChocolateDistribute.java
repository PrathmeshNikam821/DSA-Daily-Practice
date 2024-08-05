
/*
 * 
 * 
 * Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.

Example 1:

Input:
N = 8, M = 5
A = {3, 4, 1, 9, 56, 7, 9, 12}
Output: 6
Explanation: The minimum difference between maximum chocolates and minimum chocolates is 9 - 3 = 6 by choosing following M packets :{3, 4, 9, 7, 9}.
 */

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistribute {

    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        
        if(a.size() == 0 || m == 0){
            return 0 ;
        }
        
        if(m>a.size()){
            return -1 ;
        }
        
        
       long  minDiff = Integer.MAX_VALUE ; 
        
        
        Collections.sort(a);
        
        for(int i = 0 ; i<=a.size()-m ; i++){
            long diff = a.get(i+m-1)-a.get(i);
            if(diff<minDiff){
                minDiff = diff;
            }
        }
        
        return minDiff;
    }
}
