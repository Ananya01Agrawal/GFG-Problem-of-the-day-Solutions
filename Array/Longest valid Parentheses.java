


class Solution{
    int max = 0;
    static int maxLength(String s){
        // code here
        int n = s.length();
        int left = 0;
        int right = 0 ;
        int max = 0;
        
        for(int i = 0 ; i < n ; i++) {
            if(s.charAt(i) == '(')
                left++;
                
            if(s.charAt(i) == ')')
                right++;
                
            if(left == right) {
                max = Math.max(max , 2 * left);
            }
            if(right > left){
                left = 0;
                right = 0;
            }
        }
        right = 0;
        left = 0;
        
        for(int i = n-1 ; i >= 0 ; i--) {
            if(s.charAt(i) == '(')
                left++;
                
            if(s.charAt(i) == ')')
                right++;
                
            if(left == right) {
                max = Math.max(max , 2 * left);
            }
            if(right < left){
                left = 0;
                right = 0;
            }
        }
        
        return max;
    }
    
    
}
