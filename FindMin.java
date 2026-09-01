public class FindMin {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 7, 8, 9, 10 };
        System.out.println(findMin(arr));
    }
     
    static int findMin(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
