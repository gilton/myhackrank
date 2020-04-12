package hackerrank.algorithms.warmup.minimaxsum;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	long min = 0;
        long max = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
         	if( i >= 1 ) 			{ max += arr[i]; }
        	if( i < arr.length-1 ) 	{ min += arr[i]; }
        }
        
        System.out.println(min+" "+max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
