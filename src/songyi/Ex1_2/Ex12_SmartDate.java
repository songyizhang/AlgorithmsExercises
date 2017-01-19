package songyi.Ex1_2;

import edu.princeton.cs.algs4.StdOut;

public class Ex12_SmartDate {
	public static void main(String[] args) {
		Ex12_SmartDate smartDate = new Ex12_SmartDate(1, 29, 2048);
		StdOut.println(smartDate.dayOfTheWeek());
	}

	private final int month;
	private final int day;
	private final int year;
	private int num = 0;
	private boolean tagIsLeap = false;

	public Ex12_SmartDate(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
		tagIsLeap = (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
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

	public String dayOfTheWeek() {
		num += day;
		for (int m = 2; m <= month; m++) {
			if (m == 2 || m == 4 || m == 6 || m == 8 || m == 9 || m == 11) {
				num += 31;
			} else if (m == 5 || m == 7 || m == 10 || m == 12) {
				num += 30;
			} else if (m == 3 && !tagIsLeap) {
				num += 28;
			} else if (m == 3 && tagIsLeap) {
				num += 29;
			}
		}
		
		for (int y = 2000; y < year; y++) {
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
				num += 366;
			} else {
				num += 365;
			}
		}

		switch (num % 7) {
		case 0:
			return "Friday";
		case 1:
			return "Saturday";
		case 2:
			return "Sunday";
		case 3:
			return "Monday";
		case 4:
			return "Tuesday";
		case 5:
			return "Wednesday";
		case 6:
			return "Thursday";
		default:
			return "error";
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
