

class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();
        
        for(int i:a) s1.add(i);
        for(int i:b){
            if(s1.contains(i)) s2.add(i);
        }
        return new ArrayList<Integer>(s2);
    }
}
