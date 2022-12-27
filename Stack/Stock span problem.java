class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int prices[], int n)
    {
        // Your code here
        int[]span=new int[n];
        span[0]=1;//span of first element is always 1
        
        Stack<Integer> indexStack=new Stack<>();
        
        //push the index of the first element
        indexStack.push(0);
        
        for(int i=1;i<prices.length;i++){
            while(!indexStack.isEmpty() &&prices[indexStack.peek()]<=prices[i])
            indexStack.pop();
            
            if(indexStack.isEmpty())
                span[i]=i+1;
            else
                span[i]=i-indexStack.peek();
                
            indexStack.push(i);
        }
        return span;
    }
    
}
