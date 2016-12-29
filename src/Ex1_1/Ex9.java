package Ex1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex9 {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		String s = "";
		for (int n = N; n > 0; n = n / 2) {
			s = n % 2 + s;
		}
		StdOut.println(s);
	}
}
