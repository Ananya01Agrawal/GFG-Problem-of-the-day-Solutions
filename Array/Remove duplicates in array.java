class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
         ArrayList<Integer> result = new ArrayList<>();

    
        for (int num : arr) {
            if (set.add(num)) {
                result.add(num);
            }
    }
    return result;
    }
}
