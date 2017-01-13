package songyi.Ex1_2;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class Ex10_VisualCounter {
	public static void main(String[] args) {
		VisualCounter visualCounter = new VisualCounter(6, 4);
		visualCounter.add();
		visualCounter.subs();
		visualCounter.subs();
		visualCounter.subs();
		visualCounter.subs();
	}
}

class VisualCounter {
	int N;
	int max;
	int value = 0;
	int count = 0;

	public VisualCounter(int N, int max) {
		this.N = N;
		this.max = max;
		StdDraw.setXscale(0, N + 1);
		StdDraw.setYscale(-max, max);
		StdDraw.setPenRadius(0.005);
		StdDraw.setPenColor(StdDraw.RED);
	}

	public void add() {
		if (count < N && Math.abs(value) < max) {
			value++;
			count++;
			StdDraw.point(count, value);
		} else {
			StdOut.println("超出操作最大次数或超出最大绝对值");
		}
	}

	public void subs() {
		if (count < N && Math.abs(value) < max) {
			value--;
			count++;
			StdDraw.point(count, value);
		} else {
			StdOut.println("超出操作最大次数或超出最大绝对值");
		}
	}

}
