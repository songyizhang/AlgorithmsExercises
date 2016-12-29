package Ex1_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex39 {
	public static void main(String[] args) {
		// int T = Integer.parseInt(args[0]);
		int T = 5;
		int[] N = { 1000, 10000, 100000, 1000000 };
		for (int i = 0; i < N.length; i++) {
			StdOut.printf("%7d: %.2f\n", N[i], compare(T, N[i]));
		}
	}

	private static double compare(int T, int N) {
		int count = 0;
		for (int j = 0; j < T; j++) {
			int[] a = new int[N];
			int[] b = new int[N];
			for (int i = 0; i < N; i++) {
				a[i] = StdRandom.uniform(100000, 1000000);
				b[i] = StdRandom.uniform(100000, 1000000);
			}
			Arrays.sort(b);
			for (int i = 0; i < a.length; i++) {
				if (rank(a[i], b) >= 0) {
					count++;
				}
			}
		}
		return 1.0 * count / T;
	}

	private static int rank(int key, int[] a) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) {
				hi = mid - 1;
			} else if (key > a[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;

	}

}
