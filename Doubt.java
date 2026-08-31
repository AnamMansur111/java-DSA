import java.util.Scanner;
import java.util.Arrays;
public class Doubt {
      public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int[] arr = new int[3];
          for (int i = 0; i < arr.length; i++) {
              arr[i] = in.nextInt();

          }
        
        System.out.println(Arrays.toString(arr));
    }
}

