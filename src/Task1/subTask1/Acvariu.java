package Task1.subTask1; /**
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

		File myf = new File(name + ".txt");
		x = new Scanner(new File(name + ".txt"));

		while (x.hasNext()) {

			info[0] = x.next();
			info[1] = x.next();
			info[2] = x.next();
			info[3] = x.next();

		}
		x.close();
	}


	Acvariu() throws Exception

	{
		boolean check;

		// tipul III de exceptie
		do {
			try {
				try {
					check = false;
					System.out.println("Introduceti numarul de pesti:");

					nrPesti = Integer.valueOf(br.readLine());
					if (nrPesti < 1 || nrPesti > 20)
						throw new Except(nrPesti, 1);
				} catch (NumberFormatException x) {
					throw new Except(x);
				}
			} catch (Except x) {
				check = true;
				x.prelucrare();
			}

		} while (check);

		System.out.println("Introduceti informatia despre vetuitoarele din acvariu:");
		peste = new int[nrPesti];
		for (int i = 0; i < nrPesti; i++) {
			do {
				check = false;
				try {
					try {
						System.out.println("Vetuitoarea " + (i + 1));
						peste[i] = Integer.parseInt(br.readLine());
						if (peste[i] != -1 && peste[i] != 1 && peste[i] != 0)
							throw new Except(peste[i], 2);
					} catch (NumberFormatException x) {
						throw new Except(x);
					}
				} catch (Except x) {
					check = true;
					x.prelucrare();
				}

			} while (check);
		}

		do {
			check = false;
			try {
				try {
					System.out.println("Introduceti pretul (MDL) :");
					pret = Double.parseDouble(br.readLine());
					if (pret <= 0 || pret > 5000)
						throw new Except(pret);
				} catch (NumberFormatException x) {
					throw new Except(x);
				}
			} catch (Except x) {
				check = true;
				x.prelucrare();
			}

		} while (check);

		do {
			check = false;
			try {
				try {
					System.out.println("Introduceti volumul(metri cub) :");
					volum = Byte.parseByte(br.readLine());
					if (volum <= 0 || volum > 10)
						throw new Except(volum);
				} catch (NumberFormatException x) {
					throw new Except(x);
				}
			} catch (Except x) {
				check = true;
				x.prelucrare();
			}

		} while (check);


	}


	public int getPeste(int id) throws IndexOutOfBoundsException {
		return peste[id];

	}


	public void printInfo() {
		System.out.println("Name:                  " + name);
		System.out.println("Numarul de vetuitoare: " + nrPesti);

		System.out.println("Pretul:                " + pret + "MDL");

		System.out.println("Volumul:               " + volum + "m (cub)");
		for (int i = 0; i < nrPesti; i++)
			System.out.print(peste[i] + " ");
		System.out.println(" \n----------------------------------------------------------- ");
	}


	public double getVolum() {
		return volum;
	}

	public void setVolum(byte volum) {

		if (volum > 0) {
			this.volum = volum;
		}
	}

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) throws Except {

		this.pret = pret;
		if (pret < 0 || pret > 5000)
			throw new Except(pret);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public void setInfoFromFile(boolean x) throws ClassCastException {
		if (x) {

			nrPesti = Integer.parseInt((String) info[0]);
			peste = new int[nrPesti];

			for (int i = 0; i < nrPesti; i++) {

				peste[i] = Integer.parseInt((String) info[1]);
			}

			pret = Double.parseDouble((String) info[2]);

			volum = Byte.parseByte((String) info[3]);
		} else {

			nrPesti = (Integer)info[0];
			peste = new int[nrPesti];

			for (int i = 0; i < nrPesti; i++) {

				peste[i] = (Integer)info[1];
			}

			pret = (Double)info[2];

			volum = (Byte)info[3];

		}
	}

	@Override
	public String getMessage() {
		return (new String("Hey I have just used the overridden method of Throwable class getMessage"));
	}
}
