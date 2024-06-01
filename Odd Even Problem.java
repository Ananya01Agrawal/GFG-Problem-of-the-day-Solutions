class Solution {
    public static String oddEven(String s) {
        
        // first we create the frequency array to store the frequency of numberd
        int [] freq=new int[27];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-96]+=1;
        }
        int sum=0;
        for(int i=1;i<=26;i++){
            if(freq[i]!=0){
                if(i%2==0 && freq[i]%2==0)
                sum++;
                else if(i%2!=0 && freq[i]%2!=0)
                sum++;
            }
        }
        if(sum%2==0)
            return "EVEN";
        else
            return "ODD";
    }
}
