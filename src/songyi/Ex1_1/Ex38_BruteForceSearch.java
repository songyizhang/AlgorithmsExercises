
package songyi.Ex1_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex38_BruteForceSearch {
	public static void main(String[] args) {
		In in = new In(args[0]);
		int[] whitelist = in.readAllInts();
		Arrays.sort(whitelist);
		long time = System.currentTimeMillis();
		while (!StdIn.isEmpty()) {
			// ��ȡ��ֵ������������ڰ������������ӡ
			int key = StdIn.readInt();
			if (rank(key, whitelist) < 0) {
				StdOut.println(key);
			}
		}
		long duration = System.currentTimeMillis() - time;
		StdOut.println("������������ʱ��Ϊ:" + duration + "����");
	}

	private static int rank(int key, int[] whitelist) {
		for (int i = 0; i < whitelist.length; i++) {
			if (whitelist[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
