import java.util.Arrays;
/*
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
 */
public class longPrefix {
    
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        Arrays.sort(strs);


        int n = strs.length - 1 ;

        String s1 = strs[0];
        String s2 = strs[n];

        for(int i = 0 ; i<Math.min(s1.length() , s2.length()) ; i++){
            if(s1.charAt(i) == s2.charAt(i)){
                sb.append(s1.charAt(i));
            } else{
                break ;
            }
        }

        return sb.toString();
    
}
}
