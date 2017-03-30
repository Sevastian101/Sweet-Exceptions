package Task1.subTasks23;

import Task1.subTask1.Except;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by sodobescu on 3/29/2017.
 */
public class MyMap {


	private static final Map<Integer, Throwable> myMap;
	static
	{
		myMap = new HashMap();
		myMap.put(1, new Except(2.2));
		myMap.put(2, new ArrayIndexOutOfBoundsException());
		myMap.put(3, new ClassCastException());
	}
	public void throwAnException() throws Throwable {
		Random rand = new Random();

		int  n = rand.nextInt(3) + 1;
         throw myMap.get(n);


	}
}
