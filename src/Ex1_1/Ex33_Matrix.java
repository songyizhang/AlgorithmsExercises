package Ex1_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class Ex33_Matrix {
	public static void main(String[] args) {
		double[] x = { 1, 2, 3 };
		double[] y = { 1, 2, 3 };

		double[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		double[][] b = { { 1, 4 }, { 2, 5 }, { 3, 6 } };

		double l = dot(x, y);
		StdOut.println("dot(x, y):\n" + l);
		double[][] m = mult(a, b);
		Print("mult(a, b)", m);
		double[][] n = transpose(a);
		Print("transpose(a)", n);
		double[] p = mult(a, x);
		StdOut.println("mult(a, x):" + Arrays.toString(p));
		double[] q = mult(y, b);
		StdOut.println("mult(y, b):" + Arrays.toString(q));
	}

	private static double dot(double[] x, double[] y) {
		double sum = 0;
		for (int i = 0; i < y.length; i++) {
			sum += x[i] * y[i];
		}
		return sum;
	}

	private static double[][] mult(double[][] a, double[][] b) {
		double[][] r = new double[a.length][b[0].length];
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < r[i].length; j++) {
				for (int j2 = 0; j2 < a[0].length; j2++) {
					r[i][j] += a[i][j2] * b[j2][j];
				}

			}
		}
		return r;
	}

	private static double[][] transpose(double[][] a) {
		double[][] r = new double[a[0].length][a.length];
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < r[i].length; j++) {
				r[i][j] = a[j][i];
			}
		}
		return r;
	}

	private static double[] mult(double[][] a, double[] x) {
		double[] r = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				r[i] += a[i][j] * x[j];
			}
		}
		return r;
	}

	private static double[] mult(double[] y, double[][] a) {
		double[] r = new double[a[0].length];
		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {
				r[i] += y[j] * a[j][i];
			}
		}
		return r;
	}

	public static void Print(String n, double[][] a) {
		StdOut.println(n + ":");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				StdOut.print(a[i][j] + " ");
			}
			StdOut.println();
		}
	}

}
