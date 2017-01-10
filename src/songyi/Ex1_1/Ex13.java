package songyi.Ex1_1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex13 {
	public static void main(String[] args) {
		int M = StdRandom.uniform(9) + 1;
		int N = StdRandom.uniform(9) + 1;
		int[][] a = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				a[i][j] = StdRandom.uniform(10);
			}
		}
		StdOut.println("原数组为：");
		printArray(a);
		StdOut.println("转置后的数组为：");
		int[][] b = transArrays(a);
		printArray(b);
	}

	private static int[][] transArrays(int[][] a) {
		int[][] b = new int[a[0].length][a.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = a[j][i];
			}
		}
		return b;
	}

	private static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				StdOut.print(a[i][j] + " ");
			}
			StdOut.println();
		}

	}
}
