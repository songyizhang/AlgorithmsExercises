package songyi.Ex1_1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex35 {

	static int SIDES = 6;

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);

		double[] theory = onTheory();
		double[] experim = onExperim(N);

		for (int i = 2; i <= 2 * SIDES; i++) {
			StdOut.printf("%7d", i);
		}
		StdOut.println();

		for (int i = 2; i <= 2 * SIDES; i++) {
			StdOut.printf("%7.3f", theory[i]);
		}
		StdOut.println();

		for (int i = 2; i <= 2 * SIDES; i++) {
			StdOut.printf("%7.3f", experim[i]);
		}
		StdOut.println();

	}

	private static double[] onTheory() {
		double[] dist = new double[2 * SIDES + 1];
		for (int i = 1; i <= SIDES; i++) {
			for (int j = 1; j <= SIDES; j++) {
				dist[i + j] += 1.0;
			}
		}

		for (int k = 2; k <= 2 * SIDES; k++) {
			dist[k] /= 36.0;
		}
		return dist;
	}

	private static double[] onExperim(int N) {
		double[] dist = new double[2 * SIDES + 1];
		for (int i = 0; i < N; i++) {
			dist[throwDice()]++;
		}

		for (int k = 2; k <= 2 * SIDES; k++) {
			dist[k] /= N;
		}
		return dist;
	}

	private static int throwDice() {
		return StdRandom.uniform(1, SIDES + 1) + StdRandom.uniform(1, SIDES + 1);
	}

}
