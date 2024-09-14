class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();
        
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>=0){
                pos.add(arr.get(i));
            }
            else{
                neg.add(arr.get(i));
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        int i=0,j=0;
            int n=pos.size();
        int m=neg.size();
       while (i < n && j < m) {
            ans.add(pos.get(i));
            ans.add(neg.get(j));
            i++;
            j++;
        }
          while (i < n) {
            ans.add(pos.get(i));
            i++;
        }
        
        // If any negative numbers are left
        while (j < m) {
            ans.add(neg.get(j));
            j++;
        }
        
        // Copy rearranged array back to the original array
        for (int k = 0; k < arr.size(); k++) {
            arr.set(k, ans.get(k));
        }
    }
}
