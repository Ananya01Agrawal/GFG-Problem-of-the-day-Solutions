class Solution {
    long wineSelling(int arr[],int N){
        // code here
        int[] index=new int[N];
        int j=0;
        Arrays.fill(index,-1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                index[j++]=i;
            }
        }
        j=0;
        int i=0;
        long ans=0;
        while(i<N && j<N){
            if(index[j]==-1){
                break;
            }
            
            if(arr[i]==0 || arr[i]<0 ){
                i++;
            }
            else{
                int min=Math.min(-arr[index[j]],arr[i]);
                ans+=min*Math.abs(index[j]-i);
                
                if(min==-arr[index[j]]){
                    j++;
                    arr[i]=arr[i]-min;
                }
                else if(min==arr[i]){
                    arr[index[j]]+=min;
                    arr[i]=0;
                }
                
                if(arr[i]==0){
                    i++;
                }
            }
            
        }
        return ans;
    }
}
