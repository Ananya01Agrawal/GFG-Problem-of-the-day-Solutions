

class Solution {
    void rearrange(int arr[], int n) {
        // code here
        List <Integer>a=new ArrayList<>();
        List<Integer>b=new ArrayList<>();
        for(int i:arr){
            if(i>=0)a.add(i);
            else b.add(i);
        }
        int idx=0;
        int i=0;
        for(i=0;i<n && idx<a.size() && idx<b.size();i+=2)
        {
            arr[i]=a.get(idx);
            arr[i+1]=b.get(idx);
            idx++;
        }
        if(a.size()>b.size()){
            for(;i<n;i++){
                arr[i]=a.get(idx++);
            }
        }
        else{
            for(;i<n;i++){
                arr[i]=b.get(idx++);
            }
        }
    }
}
