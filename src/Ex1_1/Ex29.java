package Ex1_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex29 {

	public static void main(String[] args) {
		In in = new In(args[0]);
		int[] whitelist = in.readAllInts();
		Arrays.sort(whitelist);
		
		while (!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			// if (rank(key, whitelist) < 0) {
			// StdOut.println(key);
			// }
			StdOut.println("r:" + rank2(key, whitelist) + " c:" + count(key, whitelist));
		}
	}

	private static int count(int key, int[] a) {
		int i = 0;
		for (int j = 0; j < a.length; j++) {
			if (a[i] == key) {
				i++;
			}
		}
		return i;
		
	}

	private static int rank2(int key, int[] a) {
		int i = 0;
		for (int j = 0; j < a.length; j++) {
			if (a[i] < key) {
				i++;
			}
		}
		return i;
	}

	private static int rank(int key, int[] a) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) {
				hi = mid - 1;
			} else if (key > a[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;

	}

}
