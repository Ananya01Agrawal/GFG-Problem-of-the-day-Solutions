class Solution {
    long ExtractNumber(String sentence) {
        // code here
        long ans = -1;
        String[] arr = sentence.split(" ");
        for( String s : arr){
            if(s.charAt(0) >= '0' && s.charAt(0) < '9' && !s.contains("9") ) {
                long curr = Long.parseLong(s);
                ans = Math.max(ans, curr);
            }
        }
        return ans;
    }
}
