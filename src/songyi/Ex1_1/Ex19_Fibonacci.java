package songyi.Ex1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex19_Fibonacci {

	static long[] n = new long[100];

	public static void main(String[] args) {
		for (int N = 0; N < 100; N++) {
			StdOut.println(N + " " + F2(N));
		}
	}

	public static long F(int N) {
		if (N == 0)
			return 0;
		if (N == 1)
			return 1;
		return F(N - 1) + F(N - 2);
	}

	public static long F2(int N) {
		if (N <= 1) {
			n[0] = 0;
			n[1] = 1;
		}
		if (N > 1) {
			n[N] = n[N - 1] + n[N - 2];
		}
		return n[N];
	}

}
