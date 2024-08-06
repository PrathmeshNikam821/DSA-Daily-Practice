public class IsPalindrome{
    

    /*
     * 
     * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
     */
        public boolean isPalindrome(String s) {
            if(s.isEmpty()){
                return true ; 
            }
    
            int start = 0 ;
            int end = s.length() - 1 ;
            
            while(start<=end){
                char first = s.charAt(start);
                char last = s.charAt(end);
    
                if(!Character.isLetterOrDigit(first)){
                    start++;
                }else if(!Character.isLetterOrDigit(last)){
                    end--;
                } else{
                    if(Character.toLowerCase(first)!= Character.toLowerCase(last)){
                        return false ;
                    }
    
                    start ++ ; 
                    end -- ;
                }
    
                
            }
    
            return true ;
        }
    
}