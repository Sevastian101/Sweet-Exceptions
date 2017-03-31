package Task1.subTask1;
/**
 * Created by sodobescu on 3/29/2017.
 */
import java.util.*;
import java.io.*;

class Acvariu extends Throwable {

	String name = "Nemo";
	int nrPesti;
	int peste[];
	double pret;
	byte volum;
	Object info[] = new Object[4];

	Scanner x;
	InputStreamReader istream = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(istream);

	Acvariu(String name) throws FileNotFoundException {
		x = new Scanner(new File("C:\\Users\\sodobescu\\Desktop\\IntelliJ IDEA Workstation\\Sweet Exceptions\\"+name + ".txt"));
		while (x.hasNext()) {
			info[0] = x.next();
			info[1] = x.next();
			info[2] = x.next();
			info[3] = x.next();
		}x.close();
	}

	public int getPeste(int id) throws IndexOutOfBoundsException {
		return peste[id];
	}

	public void printInfo() {
		System.out.println("Name:                  " + name);
		System.out.println("Numarul de vetuitoare: " + nrPesti);
		System.out.println("Pretul:                " + pret + "MDL");
		System.out.println("Volumul:               " + volum + "m (cub)");
		for (int i = 0; i < nrPesti; i++) System.out.print(peste[i] + " ");
		System.out.println(" \n-------------------------------------------");
	}

	public void setName(String name) {this.name = name;}

	public void setInfoFromFile(boolean x) throws ClassCastException {
		if (x) {
			nrPesti = Integer.parseInt((String) info[0]);
			peste = new int[nrPesti];
			for (int i = 0; i < nrPesti; i++)peste[i] = Integer.parseInt((String) info[1]);
			pret = Double.parseDouble((String) info[2]);
			volum = Byte.parseByte((String) info[3]);

		} else {
			nrPesti = (Integer)info[0];
			peste = new int[nrPesti];
			for (int i = 0; i < nrPesti; i++) peste[i] = (Integer)info[1];
			pret = (Double)info[2];
			volum = (Byte)info[3];
		}
	}
	@Override
	public String getMessage() {
		return (new String("Hey I have just used the overridden method of Throwable class getMessage"));
	}
}
