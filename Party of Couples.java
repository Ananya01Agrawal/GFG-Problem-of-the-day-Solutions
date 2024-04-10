

//User function Template for Java

class Solution{
    static int findSingle(int n, int arr[]){
        // code here
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=arr[i]^xor;
        }
        return xor;
    }
}
