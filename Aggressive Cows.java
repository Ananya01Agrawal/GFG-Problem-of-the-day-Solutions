

// User function Template for Java
class Solution {

    public static boolean isAggressive(int[] arr, int n, int cows, int dist){

        int placedCowPositipon = arr[0], cowCount = 1;

        for(int i = 1; i<n; i++){

            if(arr[i] - placedCowPositipon >= dist){

                cowCount ++;

                placedCowPositipon = arr[i];

            }

        }

        return cows <= cowCount;

    }

    public static int solve(int n, int cows, int[] stallsPosition) {

        Arrays.sort(stallsPosition);

        int start = 1, end = stallsPosition[n-1] - stallsPosition[0];

        while(start <= end){

            int mid = (start + end)/2;

            if( isAggressive (stallsPosition, n, cows, mid) == true){

                start = mid + 1;

            }

            else{

                end = mid -1;

            }

        }

        return end;

    }

}
