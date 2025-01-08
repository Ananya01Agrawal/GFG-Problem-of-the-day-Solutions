

// User function Template for Java

class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
    	int n=arr.length;
    	int cnt=0;
    	for(int i=n-1;i>=2;i--) {
    		int l=0;
    		int h=i-1;
    		while(l<h) {
    		    int sum=arr[l]+arr[h];
    			if(sum>arr[i]) {
    				cnt+=h-l;
    				h--;
    			}else{
    			    l++;
    			}
    		}
    	}
       return cnt;
    }
}
