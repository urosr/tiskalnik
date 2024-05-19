/**
 * Program.java
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

// Vključimo paket za delo z V/I napravami in pripomočki
import java.io.*;
import java.util.*;

public class Program {
    
    // Deklariramo statično lastnost za vnos iz konzole
	private static BufferedReader in;
    
    // Deklariramo statično lastnost s seznamom tiskalnikov
	private static ArrayList<Tiskalnik> tiskalniki;
    
    /** Javna statična metoda, ki se izvede ob zagonu programa
     * @param args Seznam nizov (vhodnih argumentov), ki jih vnesemo ob zagonu programa
     * @return Metoda ne vrača nič (ker je tipa void)
     */
    
	public static void main(String[] args) {
		
		// Inicializiramo statično lastnost za vnos iz konzole
		in = new BufferedReader(new InputStreamReader(System.in));
        
        // Inicializiramo seznam tiskalnikov
		tiskalniki = new ArrayList<Tiskalnik>();
        
		// Izpišemo pozdrav v konzolo
		System.out.println("\nProgram za tiskalnik.\n");
		
		String znamka = "";
		int stevilostrani = 0;
		String mrezniIP = "";
		
		// Skušamo vprašati uporabnika katero znamko tiskalnika naj ustvarimo
		try {
		System.out.print("Vnesi znamko tiskalnika: ");
		znamka = in.readLine();
		}
		
		// Če je bila sporočena izjema
		catch(Exception e) {
			System.out.println("Napaka pri vnosu znamke: " + e);
		}
		
		// Skušamo vprašati uporabnika koliko strani lahko tiskalnik natisne z originalno kartušo
		try {
		System.out.print("Vnesi število strani, ki jih lahko natisne z originalno kartušo: ");
		stevilostrani = Integer.parseInt(in.readLine());
		}
		
		// Če je bila sporočena izjema
		catch(Exception e) {
			System.out.println("Napaka pri vnosu števila strani: " + e);
		}
		
		// Skušamo vprašati uporabnika za IP naslov mrežnega tiskalnika
		try {
		System.out.print("IP naslov mrežnega tiskalnika: ");
		mrezniIP = in.readLine();
		}
		
		// Če je bila sporočena izjema
		catch(Exception e) {
			System.out.println("Napaka pri vnosu IP naslova: " + e);
		}
		
		System.out.println("\n*************************************\n");
		
		// Deklariramo objekt tipa Tiskalnik
		Tiskalnik nedefiniranTiskalnik = new Tiskalnik();
		Tiskalnik neznan2000Tiskalnik = new Tiskalnik(stevilostrani);
		Tiskalnik hp3000Tiskalnik = new Tiskalnik(znamka, stevilostrani);
		Tiskalnik epson2500Tiskalnik = new Tiskalnik(znamka, stevilostrani, mrezniIP);
		
		// Skušamo uporabiti metodo za tiskanje
		try {
			hp3000Tiskalnik.tiskaj(30);
			epson2500Tiskalnik.tiskaj(88);
			neznan2000Tiskalnik.tiskaj(112);
		}
		catch(Exception e) {
			System.out.println("Napaka pri tiskanju: " + e);
		}
		
		// Skušamo uporabiti metodo za zamenjavo barvne kartuše
		try {
			neznan2000Tiskalnik.barvnakartusa(5000);
		}
		catch(Exception e) {
			System.out.println("Napaka pri zamenjavi barvne kartuše: " + e);
		}
		
		// Skušamo uporabiti metodo za zamenjavo črnobele kartuše
		try {
			neznan2000Tiskalnik.cbkartusa(5000);
		}
		catch(Exception e) {
			System.out.println("Napaka pri zamenjavi črnobele kartuše: " + e);
		}
 
 		// Skušamo uporabiti metodo za tiskanje
		try {
			neznan2000Tiskalnik.tiskaj(231);
		}
		catch(Exception e) {
			System.out.println("Napaka pri tiskanju: " + e);
		}
		
		System.out.println("\n*************************************\n");
		
		// Deklariramo objekt tipa Skener - ustvarimo novo multifunkcijsko napravo
		Skener brother2400Skener = new Skener(znamka, stevilostrani);
		
		// Skušamo uporabiti metodo za skeniranje
		try {
			brother2400Skener.skeniraj("PDF");
		}
		catch(Exception e) {
			System.out.println("Napaka pri skeniranju: " + e);
		}
		
		System.out.println("\n*************************************\n");
		
		// Deklariramo objekt tipa Fax - ustvarimo novo multifunkcijsko napravo
		Fax hp1800Skener = new Fax(znamka, stevilostrani);
		
		// Skušamo uporabiti metodo za pošiljanje faxa
		try {
			hp1800Skener.posljifax("+386 1 9876 543");
		}
		catch(Exception e) {
			System.out.println("Napaka pri pošiljanju faxa: " + e);
		}
        
        System.out.println("\n*************************************\n");
        
        // Na seznam dodamo štiri tiskalnike
		tiskalniki.add(new Tiskalnik("Lexmark", 2300, "192.168.1.220"));
		tiskalniki.add(new Tiskalnik("HP", 3200, "192.168.1.221"));
		tiskalniki.add(new Tiskalnik("Cannon", 1800, "192.168.1.222"));
		tiskalniki.add(new Tiskalnik("Brother", 4000, "192.168.1.223"));
		
		// Preverimo koliko tiskalnikov je v seznamu
		System.out.println("\nNa seznamu je " + tiskalniki.size() + " tiskalnikov.");
		
		// Izpišemo vse tiskalnike v seznamu
		for (int c = 0; c < tiskalniki.size(); c++) {
			System.out.println("\n" + (c + 1) + ". tiskalnik: " + tiskalniki.get(c).getTiskalnik());
		}
		
		System.out.println("\n*************************************\n");
        
        // Zanka, ki sprašuje po vnosih in vnaša objekte v seznam
		while (true) {
			// Skušamo vprašati uporabnika katero znamko tiskalnika naj ustvarimo
			try {
				System.out.print("Vnesi znamko tiskalnika: ");
				znamka = in.readLine();
				
				if (znamka.isEmpty()) {
					break;
				}
			}
			
			// Če je bila sporočena izjema
			catch(Exception e) {
				System.out.println("Napaka pri vnosu znamke: " + e);
			}
			
			// Skušamo vprašati uporabnika koliko strani lahko tiskalnik natisne z originalno kartušo
			try {
				System.out.print("Vnesi število strani, ki jih lahko natisne z originalno kartušo: ");
				stevilostrani = Integer.parseInt(in.readLine());
			}
			
			// Če je bila sporočena izjema
			catch(Exception e) {
				System.out.println("Napaka pri vnosu števila strani: " + e);
				break;
			}
			
			// Skušamo vprašati uporabnika za IP naslov mrežnega tiskalnika
			try {
				System.out.print("IP naslov mrežnega tiskalnika: ");
				mrezniIP = in.readLine();
				
				if (mrezniIP.isEmpty()) {
					break;
				}
			}
			
			// Če je bila sporočena izjema
			catch (Exception e) {
				System.out.println("Napaka pri vnosu IP naslova: " + e);
			}
			
			// Na seznam dodamo nov tiskalnik
			tiskalniki.add(new Tiskalnik(znamka, stevilostrani, mrezniIP));
		}
		
		System.out.println("\n*************************************\n");
		
		// Preverimo koliko tiskalnikov je v seznamu
		System.out.println("\nNa seznamu je " + tiskalniki.size() + " tiskalnikov.");
		
		// Izpišemo vse tiskalnike v seznamu
		for(int c = 0; c < tiskalniki.size(); c++) {
			System.out.println("\n" + (c + 1) + ". tiskalnik: " + tiskalniki.get(c).getTiskalnik());
		}
		
	}
}
