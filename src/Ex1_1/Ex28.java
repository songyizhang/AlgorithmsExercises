package Ex1_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex28 {

	public static void main(String[] args) {
		In in = new In(args[0]);
		int[] whitelist = in.readAllInts();
		Arrays.sort(whitelist);
		whitelist = delrepeat(whitelist);
		StdOut.println(Arrays.toString(whitelist));
		while (!StdIn.isEmpty()) {
			// 读取键值，如果不存在于白名单中则将其打印
			int key = StdIn.readInt();
			if (rank(key, whitelist) < 0) {
				StdOut.println(key);
			}
		}
	}

	private static int[] delrepeat(int[] whitelist) {
		boolean tag = false;
		int repeat = 0;
		for (int i = 0; i < whitelist.length - 1; i++) {
			if (whitelist[i] == whitelist[i + 1]) {
				tag = true;
				repeat++;
				whitelist[i] = -1;
			}
		}
		if (tag) {
			int[] norepeatlist = new int[whitelist.length - repeat];
			int j = 0;
			for (int i = 0; i < whitelist.length; i++) {
				if (whitelist[i] == -1) {
					j++;
					continue;
				}
				norepeatlist[i - j] = whitelist[i];
			}
			return norepeatlist;
		} else {
			return whitelist;
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
