package zadatak1.poslovna_logika;

import java.io.*;

public class TekstDemo {
	
	public String ucitajTekst(String nazivFajla) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(nazivFajla));
			boolean kraj = false;
			String tekst = "";
			while (!kraj) {
				String pom = in.readLine();
				if (pom == null)
					kraj = true;
				else
					tekst = tekst + pom + "\n";
			}
			in.close();
			return tekst;
		} catch (Exception e) {
			return null;
		}
	}

	public void upisiTekst(String nazivFajla, String tekst) {
		try {
			PrintWriter out = new PrintWriter(new FileWriter(nazivFajla));
			out.write(tekst);
			out.close();
		} catch (Exception e) {
			System.out.println("GRESKA: " + e.getMessage());
		}
	}
}