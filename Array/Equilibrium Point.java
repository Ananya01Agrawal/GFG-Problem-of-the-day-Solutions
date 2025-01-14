

class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
           if(arr.length==1) return 1;
        long tot=0;
        long left=0;
        for(int i=0;i<arr.length;i++){
            tot+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            tot-=arr[i];
            if(tot==left){
                return i;
            }
            left+=arr[i];
        }
    
        return -1;
    }
}
