class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
         Map<String, ArrayList<String>> map = new LinkedHashMap<>(); 
        for (String s : arr) {
            char[] sarr = s.toCharArray();
            Arrays.sort(sarr);
            String key = new String(sarr);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        ArrayList<ArrayList<String>> result = new ArrayList<>();
        for (ArrayList<String> group : map.values()) {
            result.add(group); 
        }

        return result;
    }
}
