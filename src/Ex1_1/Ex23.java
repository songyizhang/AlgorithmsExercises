package Ex1_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex23 {
	public static void main(String[] args) {
		In in = new In(args[0]);
		int[] whitelist = in.readAllInts();
		String tag = args[1];
		Arrays.sort(whitelist);
		while (!StdIn.isEmpty()) {
			// 读取键值，如果不存在于白名单中则将其打印
			int key = StdIn.readInt();
			if (rank(key, whitelist) < 0 && tag.equals("+")) {
				StdOut.println(key);
			} else if (rank(key, whitelist) >= 0 && tag.equals("-")) {
				StdOut.println(key);
			}
		}
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
