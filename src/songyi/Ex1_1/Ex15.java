package songyi.Ex1_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class Ex15 {
	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 2, 2, 2 };
		int M = 4;
		int[] n = histogram(a, M);
		StdOut.println(Arrays.toString(n));
	}

	private static int[] histogram(int[] a, int M) {
		int[] n = new int[M];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < M) {
				n[a[i]]++;
			}
		}
		return n;

	}
}
