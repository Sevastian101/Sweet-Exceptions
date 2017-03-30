package Task2;

/**
 * Created by sodobescu on 3/29/2017.
 */
public class App {

	public int sumOfArray(int[] a, int n) {
		assert a.length < n : "Sweet exceptions";
		if (n == 0)
			return a[n];
		else
			return a[n] + sumOfArray(a, n - 1);
	}

	public static void main(String Args[]) {

		int[] myArray = new int[5];
		for (int i = 0; i < myArray.length; i++) {

			myArray[i] = i;

		}



		App sum = new App();
		System.out.println(sum.sumOfArray(myArray, 5));


	}
	public void also (Boolean reportMustBeDone){
		if (reportMustBeDone) System.out.println("Not so happy");
		else System.out.println("I am happy");
	}

}
