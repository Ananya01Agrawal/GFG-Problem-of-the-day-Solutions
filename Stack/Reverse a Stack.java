class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(!s.isEmpty()){
            arr.add(s.peek());
            s.pop();
        }
        int n = arr.size();
        for(int i = 0; i<n ; i++){
            s.push(arr.get(i));
        }
    }
}
