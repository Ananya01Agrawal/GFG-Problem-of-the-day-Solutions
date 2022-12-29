class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();//new Arraylist
        Arrays.sort(arr);//sorting an array
        int count=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1] &&count!=1){
                list.add(arr[i]);
                count=1;
            }
            else if(arr[i]!=arr[i+1]){//if elements are not equal
                count=0;
            }
        }
        if(list.size()==0){// if list is empty
            list.add(-1);
        }
        return list;
    }
}
