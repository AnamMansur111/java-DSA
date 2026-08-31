import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        int[] rows;
        rows = new int[5];

        System.out.println(rows[1]);

        //syntax
        //datatype[] variableName = new datatype[size];

        int[] ros;
        ros = new int[5];
        System.out.print(ros[2]);
        //string array
        String[] arr = new String[5];
        System.out.println(arr[0]);

    }

    {
        Scanner in = new Scanner(System.in);
        
        String[] str = new String[4];
        for (int i=0; i<str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        }
    }
