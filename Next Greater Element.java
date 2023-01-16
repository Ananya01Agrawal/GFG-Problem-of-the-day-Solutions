class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
        long a[]=new long[n];

        Stack<Long>s=new Stack<>();

        for(int i=n-1;i>=0;i--)

        {

             while(!s.isEmpty() && s.peek()<arr[i])s.pop();
            if(s.isEmpty())

            a[i]=-1;

            else 

            a[i]=s.peek(); 

            s.push(arr[i]);

  }

   return a;
    } 
}
