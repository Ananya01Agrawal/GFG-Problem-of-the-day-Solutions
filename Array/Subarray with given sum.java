class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer>outputList=new ArrayList<>();
        int i=0;
        int sum=0;
        for(int j=0;j<n;j++){
            sum+=arr[j];
            
            while(sum>s){
                sum=sum-arr[i];
                i++;
            }
            if(sum==s &&i<=j){
                outputList.add(i+1);
                outputList.add(j+1);
                return outputList;
            }
            
        }
        outputList.add(-1);
        return outputList;
    }
}
