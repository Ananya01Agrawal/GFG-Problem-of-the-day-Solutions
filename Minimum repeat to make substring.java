class Solution {
    static int minRepeats(String s1, String s2) {
        // code here
         StringBuilder a=new StringBuilder(s1);
        int cnt=1;
        
        
        if(s1.contains(s2)){
            return cnt;
        }
        
        for(int i=0;i<s2.length();i++){
            if(!s1.contains(""+s2.charAt(i))){
                return -1;
            }
        }
        
        
        while(a.length()<2*s2.length()){
            a.append(s1);
            cnt++;
            
            if(a.toString().contains(s2)){
                return cnt;
            }
            
        
            
            
            
        }
        return -1;
    }
};
