package zadatak1.poslovna_logika;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TekstDemoTest {
	
	private TekstDemo tekstDemo;

	@Before
	public void setUp() throws Exception {
		tekstDemo = new TekstDemo();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void metoda_ucitajTekst() {
		String ucitaniTekst;
		try {
			ucitaniTekst = tekstDemo.ucitajTekst("tekst.txt");
			String ocekivaniTekst = "Ovo je neki tekst koji se nalazi u fajlu. Ovaj tekst treba ucitati i ispisati na ekranu.\n";
			assertEquals("Nije ucitan ocekivani tekst", ocekivaniTekst, ucitaniTekst);			
		} catch (IOException e) {
			fail("Greska prilikom ucitavanja fajla tekst.txt");
		}

	}
	
	@Test
	public void metoda_upisiTekst() {
		String testTekst = "Ovo je neki tekst koji treba upisati u fajl.\n";
		try {
			tekstDemo.upisiTekst("tekst2.txt", testTekst);
			String ucitaniTekst = tekstDemo.ucitajTekst("tekst2.txt");
			assertEquals("Nije upisan ocekivani tekst", testTekst, ucitaniTekst);				
		} catch (IOException e) {
			fail("Greska prilikom pisanja u fajl tekst2.txt");
		}
	
	}	

}
