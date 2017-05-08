package Task1_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by sodobescu on 3/29/2017.
 */
public class ExceptionThrowing extends Throwable {
	private ArrayList<String> information = new ArrayList<>();

	public void throwOutOfIndex() throws ArrayIndexOutOfBoundsException {
		String line = information.get(100);
	}

	public void throwFileNotFound() throws FileNotFoundException {
		
		File fakeFile;
		if (FileSystems.getDefault().getSeparator().equals("\\"))
			fakeFile = new File("/user/somePath/.fakeFile");
		else
			fakeFile = new File("C:\\user\\pathToTheFile\\.fakeFile");

		Scanner readFromFile = new Scanner(fakeFile);
		while (readFromFile.hasNext()) {
			information.add(readFromFile.next());
		}readFromFile.close();
	}

	public Integer throwClassCastException(String castExcept) throws ClassCastException {
		return (Integer) ((Object) castExcept);
	}
	@Override
	public String getMessage() {
		return (new String("Hey I have just used the overridden method of Throwable class getMessage"));
	}
}
