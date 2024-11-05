class GFG {
    static void rotate(int arr[][]) {
        // Code Here
          int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
            for(int i=0;i<n;i++){
            int low=0;
            int high=n-1;
            while(low<=high){
                int temp=arr[i][low];
                arr[i][low]=arr[i][high];
                arr[i][high]=temp;
                low++;
                high--;
            }
            }
    }
}
