package Ex1_2;

import java.time.DayOfWeek;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;


/*************************************************************************
 * Compilation: javac VisualAccumulator.java
 *
 *************************************************************************/

public class VisualAccumulator {
	private double total;
	private int N;

	public VisualAccumulator(int trials, double max) {
		StdDraw.setXscale(0, trials);
		StdDraw.setYscale(0, max);
		StdDraw.setPenRadius(.005);
		StdOut.println(DayOfWeek.FRIDAY);
	}

	public void addDataValue(double val) {
		N++;
		total += val;
		StdDraw.setPenColor(StdDraw.DARK_GRAY);
		StdDraw.point(N, val);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.point(N, mean());
	}

	public double mean() {
		return total / N;
	}

	public String toString() {
		return "Mean (" + N + " values): " + String.format("%8.5f", mean());
	}
}