package Ex1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex18 {
	public static void main(String[] args) {
		StdOut.println(mysteryAdd(2, 25));
		StdOut.println(mystery2Add(2, 25));
		StdOut.println(mysteryMul(2, 25));
		StdOut.println(mystery2Mul(2, 25));
	}

	private static int mysteryAdd(int a, int b) {
		if (b == 0)
			return 0;
		if (b % 2 == 0)
			return mysteryAdd(a + a, b / 2);
		return mysteryAdd(a + a, b / 2) + a;
	}

	private static int mystery2Add(int a, int b) {
		int n = 0;
		while (b != 0) {
			if (b % 2 != 0) {
				n += a;
			}
			a *= 2;
			b /= 2;
		}
		return n;
	}

	private static int mysteryMul(int a, int b) {
		if (b == 0)
			return 1;
		if (b % 2 == 0)
			return mysteryMul(a * a, b / 2);
		return mysteryMul(a * a, b / 2) * a;
	}

	private static int mystery2Mul(int a, int b) {
		int n = 1;
		while (b != 0) {
			if (b % 2 != 0) {
				n *= a;
			}
			a *= a;
			b /= 2;
		}
		return n;
	}

}
