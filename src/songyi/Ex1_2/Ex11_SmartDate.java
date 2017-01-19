package songyi.Ex1_2;

import edu.princeton.cs.algs4.StdOut;

public class Ex11_SmartDate {
	public static void main(String[] args) {
		Ex11_SmartDate smartDate = new Ex11_SmartDate(4, 30, 1800);
		StdOut.println(smartDate.year());
	}

	private final int month;
	private final int day;
	private final int year;

	public Ex11_SmartDate(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
		boolean tagIsLeap = (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
		if (m < 1 || m > 12) {
			throw new RuntimeException("months should be between 1 and 12");
		} else if (d < 1 || d > 31) {
			throw new RuntimeException("days should be between 1 and 31");
		} else if ((m == 2 && tagIsLeap) && d > 29) {
			throw new RuntimeException("the February in leap year should be between 1 and 29");
		} else if ((m == 2 && !tagIsLeap) && d > 28) {
			throw new RuntimeException("the February in common year should be between 1 and 28");
		} else if ((m == 2 || m == 4 || m == 6 || m == 9 || m == 11) && d > 30) {
			throw new RuntimeException("the date is illegal");
		}
	}

	public int month() {
		return month;
	}

	public int day() {
		return day;
	}

	public int year() {
		return year;
	}

	public String toString() {
		return month() + "/" + day() + "/" + year();
	}

}
