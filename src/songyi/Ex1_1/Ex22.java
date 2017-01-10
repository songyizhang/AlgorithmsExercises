package songyi.Ex1_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex22 {

	static int i = 0;

	public static void main(String[] args) {
		In in = new In(args[0]);
		int[] whitelist = in.readAllInts();
		Arrays.sort(whitelist);
		while (!StdIn.isEmpty()) {
			// 读取键值，如果不存在于白名单中则将其打印
			int key = StdIn.readInt();
			i = 0;
			if (rank(key, whitelist) < 0) {
				StdOut.println(key);
			}
		}
	}

	public static int rank(int key, int[] a) {
		return rank(key, a, 0, a.length - 1);
	}

	public static int rank(int key, int[] a, int lo, int hi) { // 如果key存在于a[]中，它的索引不会小于lo且不会大于hi
		for (int j = 0; j < i; j++) {
			for (int i = 0; i < 4; i++) {
				StdOut.print(" ");
			}
		}
		StdOut.println(lo + "   " + hi);
		i++;
		if (lo > hi)
			return -1;
		int mid = lo + (hi - lo) / 2;
		if (key < a[mid])
			return rank(key, a, lo, mid - 1);
		else if (key > a[mid])
			return rank(key, a, mid + 1, hi);
		else
			return mid;
	}

}
