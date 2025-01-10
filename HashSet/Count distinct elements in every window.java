

class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
         int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<=n-k;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<i+k;j++){
                set.add(arr[j]);
            }
            int len=set.size();
            res.add(len);
        }
        return res;
    }
}
