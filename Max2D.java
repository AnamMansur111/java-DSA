import java.util.Arrays;

public class Max2D {
    public static void main(String[] args) {
        int[][]arr={
            {1,3,5},
            {6,7,21},
            {12,23,32},

        };


        System.out.println((max(arr)));
    }


    static int max(int[][] arr) {
        int max=arr[0][0]; //intmax=integer.MIN_VALUE;...we can also use this coz ...min value in java is -2147483648
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] >max) {
                    max=arr[row][col];
                }
            }
        }
        return max;
    }

}

    

