package Ex1_3;

import java.util.Scanner;
import java.util.Stack;

import edu.princeton.cs.algs4.StdOut;


public class Parentheses {
	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		StdOut.println(isBalanced(s));
	}

	private static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<>();
		char zuo_xiao = '(';
		char zuo_zhong = '[';
		char zuo_da = '{';
		char you_xiao = ')';
		char you_zhong = ']';
		char you_da = '}';
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == zuo_xiao) {
				stack.push(s.charAt(i));
			} else if (s.charAt(i) == zuo_zhong) {
				stack.push(s.charAt(i));
			} else if (s.charAt(i) == zuo_da) {
				stack.push(s.charAt(i));
			} else if (s.charAt(i) == you_xiao) {
				if (stack.isEmpty()) return false;
				if (stack.pop() != zuo_xiao) return false;
			} else if (s.charAt(i) == you_zhong) {
				if (stack.isEmpty()) return false;
				if (stack.pop() != zuo_zhong) return false;
			} else if (s.charAt(i) == you_da) {
				if (stack.isEmpty()) return false;
				if (stack.pop() != zuo_da) return false;
			}
		}
		return stack.isEmpty();
	}
}
