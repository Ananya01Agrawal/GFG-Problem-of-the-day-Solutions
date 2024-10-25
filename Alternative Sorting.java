class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {

        // Your code goes here
         ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        int left=0;
        int right = n-1;
        while(left <= right){
            if(left == right){
                list.add(arr[left++]);
                return list;
            }
            list.add(arr[right--]);
             list.add(arr[left++]);
        }
        return list;
    }
}
