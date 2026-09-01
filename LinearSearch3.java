public class LinearSearch3 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 8, 12, 15, 18, 23, 24};
        int target = 18;
        int ans = linearsearch(nums, target, 4,8 );
        System.out.println(ans);
    }

    static int linearsearch(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
