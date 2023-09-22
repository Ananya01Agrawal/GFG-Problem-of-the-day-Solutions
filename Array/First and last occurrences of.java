class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        int first=-1, last=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                first=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]==x){
                last=i;
                break;
            }
        }
        ArrayList<Integer> indices=new ArrayList<>();
        indices.add(first);
        indices.add(last);
        return indices;
    }
}
