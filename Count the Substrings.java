class Solution 
{ 
    int countSubstring(String S) 
    { 
        // code here
        int count=0;// count the number of substrings
        int l=S.length();
        for(int i=0;i<l;i++){
            int countl=0;//counting the lower case characters
            int countu=0;//counting the upper case characters
            for(int j=i;j<l;j++){
                if(S.charAt(j)>='a' && S.charAt(j)<='z'){
                    countl++;
                }
                else{
                    countu++;
                }
                if(countl==countu){
                    count++;
                }
            }
        }
        return count;
        
    }
} 
