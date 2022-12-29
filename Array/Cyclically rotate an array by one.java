class Compute {
    
    public void rotate(int arr[], int n)
    {
        int temp;
        for(int i=0;i<n;i++){
            temp=arr[i];
            arr[i]=arr[n-1];
            arr[n-1]=temp;
        }
        //return arr;
        
    }
}
