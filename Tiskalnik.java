/**
 * Tiskalnik.java
 *
 * Opis:
 * Program, ki prikazuje delo z Javo
 *
 * @author Uroš Raztresen
 * @version Vaja 35
 */

/**
 * Javni razred za prikaz delovanja Jave
 */

public class Tiskalnik implements AliTiska {
    
	// Deklariramo zasebne lastnosti razreda Tiskalnik
    private String znamkaTiskalnika;
	private boolean jeBarvni;
	private String mrezniTiskalnik;
	private int kolikoStrani;
	private boolean trenutnoTiska;
	
    /** Javni konstruktor
     * @return Nov objekt tipa Tiskalnik
     */
	public Tiskalnik() {
		
		// Pokličem drug konstruktor tega istega razreda
        this ("", 0, "");
		
		//System.out.println("Ustvarjam nov objekt tipa Tiskalnik.");
	}
	
    /** Javni konstruktor
     * @param k koliko strani lahko natisne
     * @return Nov objekt tipa Tiskalnik
     */
	public Tiskalnik(int k) {
		
        // Pokličem drug konstruktor tega istega razreda
        this ("", k, "");
		
		//System.out.println("Ustvarjam nov objekt tipa Tiskalnik z možnostjo tiskanja " + k + " strani.");
	}
	
    /** Javni konstruktor
     * @param znamka znamka tiskalnik
     * @param k koliko strani lahko natisne
     * @return Nov objekt tipa Tiskalnik
     */
	public Tiskalnik(String znamka, int k) {
		
        // Pokličem drug konstruktor tega istega razreda
        this (znamka, k, "");
		
		//System.out.println("Ustvarjam nov objekt tipa Tiskalnik znamke " + znamka + " z možnostjo tiskanja " + k + " strani.");
	}
	
    /** Javni konstruktor
     * @param znamka znamka tiskalnika
     * @param k koliko strani lahko natisne
     * @param mrezni ali je mrežni tiskalnik
     * @return Nov objekt tipa Tiskalnik
     */
	public Tiskalnik(String znamka, int k, String mrezni) {
		
		// Inicializiramo lastnosti objekta
		znamkaTiskalnika = znamka;
		jeBarvni = false;
		mrezniTiskalnik = mrezni;
		kolikoStrani = k;
		trenutnoTiska = false;
		
		System.out.println("Ustvarjam nov objekt tipa Tiskalnik znamke " + znamka + " z možnostjo tiskanja " + k + " strani. Gre za mrežni tiskalnik z IP naslovom " + mrezni + ".");
	}
	
    /** Javna metoda za tiskanje
     * @param k koliko strani bo natisnjenih
     * @return true - vstavitev kartuše je uspešna, false - vstavitev kartuše ni uspešna
     */
	public boolean tiskaj(int k) {
		
		System.out.println("\nTiskam " + k + " strani.");
		
		// Izračunaj stanje kartuše
		kolikoStrani = kolikoStrani - k;
		
		System.out.println("S kartušo v tiskalniku lahko natisnemo še " + kolikoStrani + " strani.");
		
		return true;
	}
	
    /** Javna metoda za tiskanje
     * @param k koliko strani nova kartuša natisne
     * @return true - vstavitev kartuše je uspešna, false - vstavitev kartuše ni uspešna
     */
	public boolean barvnakartusa(int k) {
		
		System.out.println("\nPoteka zamenjava kartuše.");
		System.out.println("Koliko strani še lahko natisnemo s staro kartušo: " + kolikoStrani);
		
		// Če je tiskalnik barvni
		if(jeBarvni) {
			
			// Nastavimo novo število strani
			kolikoStrani = k;
			
			System.out.println("Koliko strani lahko natisnemo z novo kartušo: " + kolikoStrani);
			
			// Vrnemo uspešno zamenjavo
			return true;
		}
		else { 
			
			System.out.println("Kartuša ne ustreza barvnemu tiskalniku.");
			
			// Vrnemo neuspešno zamenjavo
			return false;
			
		}
	
	}
	
    /** Javna metoda za vstavitev nove črnobele kartuše
     * @param k koliko strani nova kartuša natisne
     * @return true - vstavitev kartuše je uspešna, false - vstavitev kartuše ni uspešna
     */
	public boolean cbkartusa(int k) {
		
		System.out.println("\nPoteka zamenjava kartuše.");
		System.out.println("Koliko strani še lahko natisnemo s staro kartušo: " + kolikoStrani);
		
		// Če je tiskalnik črnobel
		if(!jeBarvni) {
			
			// Nastavimo novo število strani
			kolikoStrani = k;
			
			System.out.println("Koliko strani lahko natisnemo z novo kartušo: " + kolikoStrani);
			
			// Vrnemo uspešno zamenjavo
			return true;
		}
		else { 
			
			System.out.println("Kartuša ne ustreza črnobelemu tiskalniku.");
			
			// Vrnemo neuspešno zamenjavo
			return false;
			
		}
	
	}
    
    /** Javna getter metoda, ki vrne znamko, število preostalih strani in mrežni naslov
     * @return vrne vrednost: niz z znamko, številom preostalih strani in mrežni naslov
     */
	public String getTiskalnik() {
		return znamkaTiskalnika;
	}
	
    /** Javna metoda, ki vrne podatek ali tiskalnik tiska in jo predpisuje vmesnik AliTiska
     * @return Vrne vrednost: boolean - ali tiska
     */
	public boolean getAliTiska(){
		return trenutnoTiska;
	}
    
    /** Javna metoda, ki vrne podatek o IP naslovu tiskalnika
     * @return Vrne IP naslov
     */
	public String getIPNaslov(){
		return mrezniTiskalnik;
	}

}
