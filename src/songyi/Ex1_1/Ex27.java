package songyi.Ex1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex27 {
	
	static int i = 0;
	
	public static void main(String[] args) {
		binomial(20, 10, 0.5);
		StdOut.println(i);
	}

	public static double binomial(int N, int k, double p) {
		i++;
		if (N == 0 && k == 0)
			return 1.0;
		if (N < 0 || k < 0)
			return 0.0;
		return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
	}

}
