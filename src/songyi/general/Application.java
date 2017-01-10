package songyi.general;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Application {
	public static final String TWONUMS = "两个数字";
	public static Object Shuru(String input) {
		switch (input) {
		case TWONUMS:
			StdOut.println("请输入两个整数");
			int a = StdIn.readInt();
			int b = StdIn.readInt();
			int[] shuzu = {a,b};
			return shuzu;

		default:
			break;
			
		}
		return null;
	}
}
