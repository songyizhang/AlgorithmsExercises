package songyi.Ex1_2;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex9 {
	public static void main(String[] args) {
		In in = new In(args[0]);
		int[] whitelist = in.readAllInts();
		Arrays.sort(whitelist);
		long time = System.currentTimeMillis();
		while (!StdIn.isEmpty()) {
			// 读取键值，如果不存在于白名单中则将其打印
			int key = StdIn.readInt();
			if (rank(key, whitelist) < 0) {
				StdOut.println(key);
			}
		}
		long duration = System.currentTimeMillis() - time;
		StdOut.println("二分查找所需时间为:" + duration + "毫秒");
	}
////
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
