/**
 * Skener.java
 *
 * Opis:
 * Program, ki prikazuje delo z Javo
 *
 * @author Uroš Raztresen
 * @version Vaja 34
 */

/**
 * Javni razred za prikaz delovanja Jave
 */

public class Skener extends Tiskalnik implements AliTiska {
	
	// Vse lastnosti od nadrazreda se prenesejo
	// Deklariramo nove lastnosti
	private boolean jeSkener;
	
    /** Javni konstruktor
     * @param z znamka multifunkcijske naprave
     * @param k koliko strani lahko natisne
     * @return Nov objekt tipa Skener
     */
	public Skener(String z, int k) {
		
		// Pokličemo konstruktor nadrazreda - ustvarimo multifunkcijsko napravo (tiskalnik)
		super(z, k);
		
		System.out.println(z + " je multifunkcijska naprava z možnostjo skeniranja.");
		
		// Inicializiramo nove lastnosti
		jeSkener = true;
		
		// Skušamo testirati tiskanje in zamenjamo kartušo - kličemo metodo, deklariramo v nadrazredu
		try {
			tiskaj(350);
			cbkartusa(k);
		}
		catch(Exception e) {
			System.out.println("Napaka pri tiskanju in zamenjavi kartuše: " + e);
		}
		
	}
	
    /** Javna metoda
     * @param t Format skeniranega dokumenta
     */
	public void skeniraj(String t) {
		
		//Skeniraj v željenem formatu
		System.out.println("\nSkeniram dokument.\nNa računalnik bo prenešen v " + t + " formatu.");
		
	}

}
