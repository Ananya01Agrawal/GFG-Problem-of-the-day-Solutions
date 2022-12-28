class GfG
{
    int minEle;
    Stack<Integer> s=new Stack<>();

    /*returns min element from stack*/
    int getMin()
    {
        if(s.isEmpty()){//check whether the stack is empty
            return -1;
        }
        return minEle;// return the minimum elemnt

    }
    
    /*returns poped element from stack*/
    int pop()
    {
        if(s.isEmpty()){
            return -1;
        }
        int a=s.peek();
        int ans;
        if(a>=minEle){
            ans=a;
            s.pop();
        }
        else{
            ans=minEle;
            minEle=2*minEle-a;
            s.pop();
        }
        return ans;
	
    }

    /*push element x into the stack*/
    void push(int x)
    {
        if(s.isEmpty()){
            s.push(x);
            minEle=x;
            
        }
        else if(x>=minEle){
            s.push(x);
        }
        else{
            s.push(2*x-minEle);
            minEle=x;
        }
    }	
}

