

// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
         int start = 0;
        int maxLength = 0;
        HashSet<Character> unique = new HashSet<>();
        
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            
            // Remove characters from the start until there's no duplicate
            while (unique.contains(currentChar)) {
                unique.remove(s.charAt(start));
                start++;
            }
            
            // Add the current character to the set
            unique.add(currentChar);
            
            // Update the max length
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }
}
