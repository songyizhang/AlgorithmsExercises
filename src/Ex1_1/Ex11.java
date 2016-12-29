package Ex1_1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex11 {
	public static void main(String[] args) {
		int m = StdRandom.uniform(9) + 1;
		int n = StdRandom.uniform(9) + 1;
		boolean[][] a = new boolean[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = StdRandom.bernoulli();
			}
		}

		StdOut.print("  ");
		for (int i = 0; i < n; i++) {
			StdOut.print(i + " ");
		}
		for (int i = 0; i < m; i++) {
			StdOut.print("\n" + i + " ");
			for (int j = 0; j < n; j++) {
				StdOut.print((a[i][j] ? "*" : " ") + " ");
			}
		}
	}
}
