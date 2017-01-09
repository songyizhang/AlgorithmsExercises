package Ex1_2;

import edu.princeton.cs.algs4.StdOut;

public class Ex4 {
	public static void main(String[] args) {
		String string1 = "hello";
		String string2 = string1;
		string1 = "world";
		StdOut.println(string1);
		StdOut.println(string2);
	}
}
