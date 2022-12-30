class Solution{

    //Function to check whether there is a subarray present with 0-sum or not.

    static boolean findsum(int arr[],int n)

    {
        Set prsum = new HashSet<Integer>();
        int sum = 0;
        prsum.add(sum);

        for(int i = 0; i<n; i++){
            sum+=arr[i];
            if(prsum.contains(sum)){
                return true;
                
            }else{
                prsum.add(sum);
                }

        }

        return false;

    }
}
