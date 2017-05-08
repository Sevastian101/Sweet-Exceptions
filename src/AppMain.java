import Task1_1.ExceptionThrowing;
/**
 * Created by sodobescu on 3/29/2017.
 */
public class AppMain {

	public static void main(String[] args) {
		//Task1.1
		ExceptionThrowing exceptionThrowing = new ExceptionThrowing();
		try {
			exceptionThrowing.throwFileNotFound();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			exceptionThrowing.throwOutOfIndex();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			exceptionThrowing.throwClassCastException("23");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// assert task
		int[] myArray = new int[5];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = i;
		}
		System.out.println(sumOfArray(myArray, 5));

	}

	// assert method
	public static int sumOfArray(int[] a, int n) {
		assert a.length < n : "Sweet exceptions";
		if (n == 0)
			return a[n];
		else
			return a[n] + sumOfArray(a, n - 1);
	}
}
