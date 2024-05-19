/**
 * Fax.java
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

public class Fax extends Tiskalnik implements AliTiska {
	
	// Vse lastnosti od nadrazreda se prenesejo
	// Deklariramo nove lastnosti
	private boolean jeFax;
	
    /** Javni konstruktor
     * @param z znamka multifunkcijske naprave
     * @param k koliko strani lahko natisne
     * @return Nov objekt tipa Fax
     */
	public Fax(String z, int k) {
		
		// Pokličemo konstruktor nadrazreda - ustvarimo multifunkcijsko napravo (tiskalnik)
		super(z, k);
		
		System.out.println(z + " je multifunkcijska naprava z možnostjo pošiljanja faxov.");
		
		// Inicializiramo nove lastnosti
		jeFax = true;
		
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
     * @param t telefonska številka
     */
	public void posljifax(String t) {
		
		//Pošlji fax na izbrano telefonsko številko
		System.out.println("\nPošiljam fax na telefonsko številko " + t + "...");
		
	}

}
