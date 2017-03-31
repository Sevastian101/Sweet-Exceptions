package Task1.subTask1; /**
 * Created by sodobescu on 3/29/2017.
 */

import java.io.FileNotFoundException;

public class Except extends Throwable
{
	int nrPesti1 = 10;
	int vetuitoare = 1;
	double pret1 = 5.5;
	byte volum = 5;
	Object error;

	public Except(Object x) {
		error = x;
	}

	public Except(int x, int t) {
		if (t == 1) nrPesti1 = x;
		if (t == 2) vetuitoare = x;
	}

	public Except(double x) {
		pret1 = x;
	}

	void prelucrare() {

		if (nrPesti1 < 1) System.out.println("Numarul de pesti nu poate fi mai mic ca 1");
		if (nrPesti1 > 20) System.out.println("Numarul de pesti nu poate fi mai mare ca 20");
		if (pret1 <= 0) System.out.println("Pretul nu poate fi mai mic sau egal cu 0");
		if (pret1 > 5000) System.out.println("Pretul nu poate fi mai mare ca 5000");
		if (vetuitoare != -1 && vetuitoare != 1 && vetuitoare != 0)System.out.println("Vetuitaoarile pot avea valorile 1 0 sau -1");
		if (volum <= 0) System.out.println("Volumul nu poate fi mai mic decit 1");
		if (volum >= 10) System.out.println("Volumul nu poate fi mai mare decit 10");

		if (error instanceof FileNotFoundException) {System.out.println("Acest fisier nu exista " );((FileNotFoundException) error).printStackTrace();}
		if (error instanceof ClassCastException) {System.out.println("ClassCastExceptio a fost aruncata");((FileNotFoundException) error).printStackTrace();}
		if (error instanceof ArrayIndexOutOfBoundsException) {System.out.println("Aceasta pozitie nu exista in Task1.subTask1.Acvariu");((FileNotFoundException) error).printStackTrace();}
	}
}
