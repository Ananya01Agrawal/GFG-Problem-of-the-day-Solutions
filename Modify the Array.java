class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
         for(int i=0;i<arr.length-1;i++){
            
            if(arr[i] == arr[i+1]){
                
                arr[i]=2*arr[i];
                arr[i+1]=0;
            }
        }
        
        ArrayList<Integer> list=new ArrayList<>();
        for(int i =0;i<arr.length;i++)
            list.add(0);
        
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0)
                list.set(index++,arr[i]);
        }
        
        return list;
    }
}
