class Solution {
    static Node construct(int arr[][]) {
        // Add your code here.
        int n = arr.length;
        Node [][] array = new Node[n][n];
        
        for(int i =0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                array[i][j] = new Node(arr[i][j]);
            }
        }
        
        Node head = array[0][0];
        for(int i =0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j + 1 < n)array[i][j].right = array[i][j+1];
                if(i + 1 < n)array[i][j].down = array[i+1][j];
            }
        }
        return head;
    }
}
