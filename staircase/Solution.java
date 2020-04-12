package hackerrank.algorithms.warmup.staircase;

import java.util.Scanner;

public class Solution {

	// Complete the staircase function below.
	static void staircase(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = 1; j < i; j++) { System.out.print(" "); }
			
			for (int k = n; k >= i; k--) { System.out.print("#"); }
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		staircase(n);

		scanner.close();
	}

}
