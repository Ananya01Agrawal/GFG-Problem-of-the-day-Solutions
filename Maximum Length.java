class Solution {
    int solve(int a, int b, int c) {
        // code here
        return ((a> 2*(b+c) +2) || (b>2*(a+c)+2) || (c>2*(a+b)+2)) ? -1 : a+b+c;
    }
};
