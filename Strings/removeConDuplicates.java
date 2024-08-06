public class removeConDuplicates {
    

    /*
     * Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.

Example 1:

Input:
S = aabb
Output:  ab 
     */
        public String removeConsecutiveCharacter(String S){
            StringBuilder sb = new StringBuilder();
            sb.append(S.charAt(0));
            
            for(int i = 1; i<S.length() ; i++){
                if(S.charAt(i) == S.charAt(i-1)){
                    continue ; 
                }
                else{
                    sb.append(S.charAt(i));
                    
                }
            }
            return sb.toString();
        }
    
}
