package Ex1_2;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex1 {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		Point2D[] points = new Point2D[N];
		for (int i = 0; i < N; i++) {
			points[i] = new Point2D(StdRandom.uniform(), StdRandom.uniform());
		}
		double distance = 2.0;
		for (int i = 0; i < points.length - 1; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double dis = points[i].distanceTo(points[j]);
				if (dis < distance) {
					distance = dis;
				}
			}
		}
		StdOut.println(distance);
	}
}
