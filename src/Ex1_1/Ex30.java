package Ex1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex30 {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		boolean[][] a = new boolean[N][N];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (gcd(i, j) == 1) {
					a[i][j] = true;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				StdOut.print(a[i][j] + " ");
			}
			StdOut.println();
		}
	}

	private static int gcd(int i, int j) {
		if (j == 0)
			return i;
		int r = i % j;
		return gcd(j, r);
	}
}
