class Solution
{
    int atoi(String s) {
        boolean isPositive = true;
        if(s.charAt(0)=='-') isPositive = false;
        
        int cnt = 1;
        String ans = "";
        for(int i = 0; i<s.length(); i++){
            if((s.charAt(i)<='9' && s.charAt(i)>='0') || (s.charAt(i)=='-'  && i==0)){
                if(s.charAt(i)=='-') continue;
                ans+=s.charAt(i);
            }else{
                return -1;
            }
        }
        int anss = Integer.valueOf(ans);
        return isPositive? anss : anss*-1;
    }
}
