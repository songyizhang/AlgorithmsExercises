package Ex1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex20 {
	public static void main(String[] args) {
		double r = factorialln(5);
		StdOut.println(r);
	}

	private static double factorialln(int n) {
		if (n == 1) {
			return 0;
		}
		return Math.log(n) + factorialln(n - 1);
	}
}
