class Solution {
    String removeDuplicates(String str) {
        String s = "";
        HashSet<Character> hs = new HashSet<>();
        
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!hs.contains(ch)){
                s += ch;
                hs.add(ch);
            }
        }
        return s;
    }
}
