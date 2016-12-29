package Ex1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex14 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		StdOut.println(lg(a));
	}

	private static int lg(int a) {
		int t = 0;
		int N = 1;
		for (; (N = N * 2) <= a; t++) {
		}
		return t;

	}
}
