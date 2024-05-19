/**
 * TiskalnikTableModel.java
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

// Uvozimo paket za delo s tabelami
import javax.swing.table.*;

// Deklariramo javni razred
public class TiskalnikTableModel extends DefaultTableModel {
		
		// Konstruktor
		public TiskalnikTableModel() {
            
            // Kliče konstruktor nadrazreda
            super();
            
            // V tabelo dodamo stolpce
            addColumn("Znamka tiskalnika");
            addColumn("IP naslov");
            
            // Dodamo naslovno vrstico
            // Ustvarimo statičen seznam objektov
            Object[] vrstica = new Object[] {"Znamka tiskalnika", "IP naslov"};
            // Dodamo vrstico v tabelo
            addRow(vrstica);
            
        }
	
	// Vhodni parametri: ts - Tiskalnik
	// Potek/opis: Metoda, ki doda tiskalnik na seznam in v tabelo
	// Vrne vrednost: /
	public void addTiskalnik(Tiskalnik ts) {
		
		// Ustvarimo statičen seznam objektov
		Object[] vrstica = new Object[] {ts.getTiskalnik(), ts.getIPNaslov()};
		
		// Dodamo vrstico v tabelo
		addRow(vrstica);
		
	}
}
