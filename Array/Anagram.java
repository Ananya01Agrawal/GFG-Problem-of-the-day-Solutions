

class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
           if (s1.length() != s2.length()) {
           return false;
       }
       
       int[] charCount = new int[26];
       for (int i=0; i<s1.length(); i++) {
           charCount[s1.charAt(i) - 'a']++;
           charCount[s2.charAt(i) - 'a']--;
       }
       
       for (int count: charCount) {
           if (count != 0) {
               return false;
           }
       }

       return true;
    }
}
