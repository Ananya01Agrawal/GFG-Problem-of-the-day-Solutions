class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        if(nums.length%2!=0) return false;
        
        // Hashset to efficiently track reminders for faorming pairs
        HashSet<Integer> set=new HashSet<>();
        
        for(int num:nums){
            //caluclate non-negative remainder when divided by 'k'
            int rem=(num%k +k)%k;
            
            //complement needed for divisble sums
            int req=(k-rem)%k;
            
            //Mnage pairs in the Hashsethttps://media.geeksforgeeks.org/img-practice/prod/courses/1/Web/Content/3-90-fab-v3_1703855049.svg
            if(set.contains(req))set.remove(req);
            else set.add(rem);
        }
        // if hashset is empty, all pairs are found
        
        return set.isEmpty();
    }
}
