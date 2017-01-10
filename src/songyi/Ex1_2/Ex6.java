package songyi.Ex1_2;

import edu.princeton.cs.algs4.StdOut;

public class Ex6 {
	public static void main(String[] args) {
		String s = args[0];
		String t = args[1];
		StdOut.println(s.length() == t.length() && s.concat(s).indexOf(t) >= 0);
	}
}
