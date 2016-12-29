package Ex1_2;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/*************************************************************************
 * Compilation: javac Interval2D.java Execution: java Interval2D
 * 
 * 2-dimensional interval data type.
 *
 *************************************************************************/

public class Interval2D {
	private final Interval1D x;
	private final Interval1D y;

	public Interval2D(Interval1D x, Interval1D y) {
		this.x = x;
		this.y = y;
	}

	// does this interval intersect that one?
	public boolean intersects(Interval2D that) {
		if (!this.x.intersects(that.x))
			return false;
		if (!this.y.intersects(that.y))
			return false;
		return true;
	}

	// does this interval contain x?
	public boolean contains(Point2D p) {
		return x.contains(p.x()) && y.contains(p.y());
	}

	// area of this interval
	public double area() {
		return x.length() * y.length();
	}

	public String toString() {
		return x + " x " + y;
	}

	// test client
	public static void main(String[] args) {
		double xlo = 0;
		double xhi = 0;
		double ylo = 5;
		double yhi = 5;
		int T = 5;

		Interval1D xinterval = new Interval1D(xlo, xhi);
		Interval1D yinterval = new Interval1D(ylo, yhi);
		Interval2D box = new Interval2D(xinterval, yinterval);

		double xc = (xhi + xlo) / 2.0;
		double yc = (yhi + ylo) / 2.0;
		StdDraw.rectangle(xc, yc, (xhi - xlo) / 2.0, (yhi - ylo) / 2.0);

		Counter counter = new Counter("hits");
		for (int t = 0; t < T; t++) {
			double x = StdRandom.random();
			double y = StdRandom.random();
			Point2D p = new Point2D(x, y);

			if (box.contains(p))
				counter.increment();
			else
				p.draw();
		}

		StdOut.println(counter);
		StdOut.printf("box area = %.2f\n", box.area());
	}

}

class Counter {
	private final String name;
	private int count;

	public Counter(String id) {
		name = id;
	}

	public void increment() {
		count++;
	}

	public int tally() {
		return count;
	}

	public String toString() {
		return count + " " + name;
	}
}
