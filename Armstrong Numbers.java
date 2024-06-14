class Solution {
    static String armstrongNumber(int n){
        // code here
        int originalNumber = n;
        int sum = 0;
        
        // Extracting each digit and calculating the sum of the cubes of its digits
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        
        // Check if the calculated sum is equal to the original number
        if (sum == originalNumber) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
