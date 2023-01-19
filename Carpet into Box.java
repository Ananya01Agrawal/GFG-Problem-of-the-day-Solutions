class Solution{
    int carpetBox(int A, int B, int C, int D) { 
        int count=0;
        if(B>A){
            int temp=B;
            B=A;
            A=temp;
        }
        if(D>C){
            int temp=C;
            C=D;
            D=temp;
        }
        while(A>C || B>D){
            count++;
            if(A>C){
                A/=2;
            }
            else if(B>D){
                B/=2;
            }
            if(B>A){
                int temp=B;
            B=A;
            A=temp;  
            }
        }

        return count;

        

    }

   

}
        
    
