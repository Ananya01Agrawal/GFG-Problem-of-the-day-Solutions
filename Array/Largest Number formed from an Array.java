class Solution {
    String printLargest(int n, String[] arr) {
        Arrays.sort(arr, (x, y) -> { return (y + x).compareTo(x + y); });
        return String.join("", arr);
    }
}
