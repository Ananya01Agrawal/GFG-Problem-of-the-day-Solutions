class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int largest = arr[0];
        int secondLargest = -1;
        for(int elem: arr){
            if(elem > largest){
                secondLargest = largest;
                largest = elem;
            }
            else if(elem != largest && elem > secondLargest){
                secondLargest = elem;
            }
        }
        return secondLargest;
    }
}
