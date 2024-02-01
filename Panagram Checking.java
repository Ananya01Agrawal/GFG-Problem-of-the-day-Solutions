class Solution {
    // Function to check if a string is Pangram or not.
    public static boolean checkPangram(String s) {
        // Check if the length of the string is less than 26 (number of alphabets).
        if (s.length() < 26) {
            // If the length is less than 26, it cannot be a Pangram.
            return false;
        }

        // Initialize a character 'a' to start checking for each alphabet.
        char a = 'a';

        // Loop through the first 26 alphabets.
        for (int i = 0; i < 26; i++) {
            // Check if the current alphabet (lowercase or uppercase) is present in the string.
            if (s.contains(Character.toString(a)) || s.contains(Character.toString(a).toUpperCase())) {
                // If present, move on to the next alphabet.
                a++;
            } else {
                // If the current alphabet is not found in the string, it is not a Pangram.
                return false;
            }
        }

        // If all 26 alphabets are found in the string, it is a Pangram.
        return true;
    }
}
