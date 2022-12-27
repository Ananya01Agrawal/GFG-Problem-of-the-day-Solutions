class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        long ls[]=new long[hist.length];//left array

       long rs[]=new long[hist.length];//right array

       Stack<Integer>s=new Stack<>();//creation of the stack
       //for left smaller
       for(int i=0;i<n;i++){
           while(!s.isEmpty() && hist[s.peek()]>=hist[i]){
               s.pop();
               
           }
           if(s.isEmpty())//checking if the stack is empty or not
           {
               ls[i]=0;// putting zero in the left array

           }
           else{
               ls[i]=s.peek()+1;
               
           }
           s.push(i);
       }
//empty the stack for next use
    while(!s.isEmpty())
    {
        s.pop();
        
    }
    //for right smaller

    for(int i=(int)n-1;i>=0;i--)
    {
        while(!s.isEmpty() && hist[s.peek()]>=hist[i]){
            s.pop();
            
        }
        if(s.isEmpty())
        {
            rs[i]=n-1;
            
        }
        else{
            rs[i]=s.peek()-1;
            
        }
        s.push(i);
        
    }
    long max=0;//initialising the maximum value as zero
    for(int i=0;i<n;i++){
        max=Math.max(max,hist[i]*(rs[i]-ls[i]+1));// printing the maximum area
        
    }
    return max;
        
    }
}





