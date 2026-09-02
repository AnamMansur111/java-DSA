public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 8, 9, 10 };
        int target = 6;
        int ans = Ceiling(arr, target);
        System.out.println(ans);

    }

    static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;

            }
        }
        return start;
    }
}
