package Ex1_1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex36_ShuffleTest {
	public static void main(String[] args) {
		int M = Integer.parseInt(args[0]);
		int N = Integer.parseInt(args[1]);

		int[][] s = new int[M][M];

		for (int i = 0; i < N; i++) {
			int[] a = new int[M];
			for (int j = 0; j < a.length; j++) {
				a[j] = j;
			}
			StdRandom.shuffle(a);
			for (int j = 0; j < M; j++) {
				s[j][a[j]]++;
			}
		}

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				StdOut.printf("%5d", s[i][j]);
			}
			StdOut.println();
		}

	}
}
