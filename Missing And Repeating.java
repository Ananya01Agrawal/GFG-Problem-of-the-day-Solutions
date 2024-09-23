class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
         int res[]=new int[2];
        HashSet<Integer>set=new HashSet<>();
        int n=arr.length;
        // long sum=(n*(n+1))/2;
        for(int i=0;i<n;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                // sum-=arr[i];
            }else{
                res[0]=arr[i];
            }
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                res[1]=i;
            }
        }
        return res;
    }
}
