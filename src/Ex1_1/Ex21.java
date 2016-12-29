package Ex1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Ex21 {
	public static void main(String[] args) {
		In in = new In(args[0]);
		String[] strings = in.readAllStrings();
		for (int i = 0; i < strings.length; i = i + 3) {
			StdOut.print(strings[i] + " " + strings[i + 1] + " " +strings[i + 2] + " ");
			double m = Double.parseDouble(strings[i + 1]);
			double n = Double.parseDouble(strings[i + 2]);
			StdOut.printf("%.3f", m / n);
			StdOut.println();
		}
	}
}
