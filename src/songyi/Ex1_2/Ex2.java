package songyi.Ex1_2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdOut;

public class Ex2 {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		double[] inter = new double[2 * N];
		for (int i = 0; i < 2 * N; i++) {
			inter[i] = Double.parseDouble(args[i + 1]);
		}
		Interval1D[] interval1ds = new Interval1D[N];
		for (int i = 0; i < N; i++) {
			if (inter[2 * i] < inter[2 * i + 1]) {
				interval1ds[i] = new Interval1D(inter[2 * i], inter[2 * i + 1]);
			} else {
				interval1ds[i] = new Interval1D(inter[2 * i + 1], inter[2 * i]);
			}
		}
		for (int i = 0; i < interval1ds.length - 1; i++) {
			for (int j = i + 1; j < interval1ds.length; j++) {
				if (interval1ds[i].intersects(interval1ds[j])) {
					StdOut.println(interval1ds[i] + " intersects " + interval1ds[j]);
				}
			}
		}
	}
}
