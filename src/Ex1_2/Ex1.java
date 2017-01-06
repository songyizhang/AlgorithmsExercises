package Ex1_2;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex1 {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		Point2D[] p = new Point2D[N];
		for (int i = 0; i < N; i++) {
			p[i] = new Point2D(StdRandom.uniform(), StdRandom.uniform());
		}
		double distance = 2.0;
		for (int i = 0; i < p.length - 1; i++) {
			for (int j = i + 1; j < p.length; j++) {
				double dis = p[i].distanceTo(p[j]);
				if (dis < distance) {
					distance = dis;
				}
			}
		}
		StdOut.println(distance);
	}
}
