package songyi.Ex1_1;

import java.awt.Color;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class Ex31 {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		double p = Double.parseDouble(args[1]);
		drawCandLink(N, p);
	}

	private static void drawCandLink(int N, double p) {
		StdDraw.setCanvasSize(1000, 1000);
		StdDraw.setScale(-1.1, 1.1);
		StdDraw.setPenRadius(0.015);
		double[][] point = new double[N][2];
		for (int i = 0; i < N; i++) {
			point[i][0] = Math.cos(2 * Math.PI * i / N);
			point[i][1] = Math.sin(2 * Math.PI * i / N);
			StdDraw.point(point[i][0], point[i][1]);
		}

		StdDraw.setPenRadius();
		StdDraw.setPenColor(Color.gray);
		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < N; j++) {
				if (StdRandom.bernoulli(p)) {
					StdDraw.line(point[i][0], point[i][1], point[j][0], point[j][1]);
				}
			}
		}

	}

}
