
package songyi.Ex1_2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex3 {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		double min = Double.parseDouble(args[1]);
		double max = Double.parseDouble(args[2]);

		MyInterval2D[] myInterval2Ds = new MyInterval2D[N];
		for (int i = 0; i < N; i++) {
			double x1 = StdRandom.uniform(min, max);
			double x2 = StdRandom.uniform(min, max);
			double y1 = StdRandom.uniform(min, max);
			double y2 = StdRandom.uniform(min, max);
			double xLo = x1 < x2 ? x1 : x2;
			double xHi = x1 > x2 ? x1 : x2;
			double yLo = y1 < y2 ? y1 : y2;
			double yHi = y1 > y2 ? y1 : y2;
			Interval1D x = new Interval1D(xLo, xHi);
			Interval1D y = new Interval1D(yLo, yHi);
			myInterval2Ds[i] = new MyInterval2D(x, y, xLo, xHi, yLo, yHi);
			myInterval2Ds[i].draw();
		}

		int numInter = 0;
		int numContains = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < N; j++) {
				if (j > i && myInterval2Ds[i].intersects(myInterval2Ds[j])) {
					numInter++;
				}
				if (j != i && myInterval2Ds[i].xLo > myInterval2Ds[j].xLo && myInterval2Ds[i].xHi < myInterval2Ds[j].xHi
						&& myInterval2Ds[i].yLo > myInterval2Ds[j].yLo && myInterval2Ds[i].yHi < myInterval2Ds[j].yHi) {
					numContains++;
				}
			}
		}
		StdOut.println("intersect number:" + numInter);
		StdOut.println("contain number:" + numContains);
	}
}

class MyInterval2D extends Interval2D {
	double xLo;
	double xHi;
	double yLo;
	double yHi;

	public MyInterval2D(Interval1D x, Interval1D y, double xLo, double xHi, double yLo, double yHi) {
		super(x, y);
		this.xLo = xLo;
		this.xHi = xHi;
		this.yLo = yLo;
		this.yHi = yHi;
	}

}
