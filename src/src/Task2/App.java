package Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
	/**
	 * This method returns sum of first n+1  numbers from array a
	 */
	public static int sumOfNArrayNumbers(ArrayList<Integer> a, int n) {
		assert a.size() > n && n >= 0 : "Sweet exceptions";
		if (n == 0) return a.get(n);
		else return a.get(n) + sumOfNArrayNumbers(a, n - 1);
	}

	public static void main(String Args[]) {
		System.out.println(sumOfNArrayNumbers(new ArrayList(Arrays.asList(1, 2, 3, 4, 5)), 4));
	}
}
