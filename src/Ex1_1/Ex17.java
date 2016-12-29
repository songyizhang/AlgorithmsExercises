package Ex1_1;

public class Ex17 {
	public static void main(String[] args) {
		exR2(6);
	}

	private static String exR2(int n) {
		String s = exR2(n - 3) + n + exR2(n - 2) + n;
		if (n <= 0)
			return "";
		return s;
	}
}
