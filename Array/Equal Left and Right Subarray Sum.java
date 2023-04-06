class Solution{
	int equalSum(int [] A, int N) {
		//Write your code here
		int l=0;
		int r=N-1;
		int leftSum=0;
		int RightSum=0;
		while(l<r){
		    if(leftSum<RightSum){
		        leftSum+=A[l];
		        l++;
		    }
		    else{
		        RightSum+=A[r];
		        r--;
		    }
		}
		return leftSum==RightSum?l+1:-1;
	}
}
