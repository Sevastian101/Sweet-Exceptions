package Task1.subTask1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by sodobescu on 3/29/2017.
 */
public class AppMain {
	public static void main(String args[]) throws Exception {

		InputStreamReader istream = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(istream);

		boolean check;
		do {
			check = false;
			try {
				try {
					System.out.println("Introduceti denumirea fisierului");
					Acvariu acv = new Acvariu(br.readLine());//ACV
					System.out.println("Setam info prin metoda 1? (true/false)");
					acv.setInfoFromFile(Boolean.parseBoolean(br.readLine()));
					System.out.println("Introduceti pozitia pestelui :)");
					System.out.println(acv.getPeste(Integer.parseInt(br.readLine())));
					System.out.println("Introduceti numele pentru acvariu:");
					acv.setName(new String("O_o"));
					acv.printInfo();
				} catch (Throwable x) {
					if(x instanceof  Throwable) System.out.println(x.getMessage());
					throw new Except(x);
				}
			} catch (Except x) {
				check = true;
				x.prelucrare();
			}
		} while (check);
	}
}
