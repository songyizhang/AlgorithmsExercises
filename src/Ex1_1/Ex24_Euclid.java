package Ex1_1;


import edu.princeton.cs.algs4.StdOut;
import general.Application;

public class Ex24_Euclid {

	public static void main(String[] args) {
		int[] a = (int[]) Application.Shuru(Application.TWONUMS);
		StdOut.print(temp(a[0], a[1]));
	}

	public static int temp(int p, int q) {
		StdOut.println("p = " + p + ",q = " + q);
		if (q == 0) {
			return p;
		}
		int r = p % q;
		return temp(q, r);
	}

}
