class Complete{
    
   
    // Function for finding maximum and value pair
    public static int maximizeSum (int arr[], int n) {
        //Complete the function
        int i = arr.length - 1;
        int j = arr.length - 2;
        int sum = 0;
        while(i >= 0){
            if(arr[i] >= 0){
                sum += arr[i];
                while(j > 0 && (arr[j] == -1 || arr[j] == arr[i])){
                    j--;
                }
                if(j >= 0 && arr[j] == arr[i] - 1){
                    arr[j] = -1;
                    j--;
                }
            }
            if(j >= i)
                j = i - 1;
            i--;
        }
        return sum;
    }
}
