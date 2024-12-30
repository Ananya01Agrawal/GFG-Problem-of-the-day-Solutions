

// User function Template for Java

class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        Set<Integer>set = new HashSet<>();
        for(int num:a){
            set.add(num);
        }
        for(int num:b){
            set.add(num);
        }
        return set.size();
    }
}
