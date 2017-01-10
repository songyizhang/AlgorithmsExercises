package songyi.Ex1_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class Ex3 {
	public static void main(String[] args) {
		int[] input = new int[3];
		for (int i = 0; i < input.length; i++) {
			input[i] = Integer.parseInt(args[i]);
		}
		StdOut.println(Arrays.toString(input));
		if (input[0] == input[1] && input[1] == input[2]) {
			StdOut.println("equal");
		} else {
			StdOut.println("not equal");
		}
	}
}
