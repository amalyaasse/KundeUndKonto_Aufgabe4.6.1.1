package KundeUndKonto;

public class Startklasse {
	
	public static void main(String[] args) {
		
		Kunde testKunde = new Kunde();
		
		testKunde.setName("Steffi");
		
		System.out.println("Name: " +testKunde.getName());
		
		
		Konto testKonto = new Konto();
		
		testKonto.einzahlen(3500);
		testKonto.einzahlen(1975.5);
		
		// Das testKonto als Konto der Kundin Steffi festlegen
		
		testKunde.setMeinKonto(testKonto);
		
		// Abfragen und Ausgeben des Kontostandes der Kundin Steffi
		// 1.Schritt: zuerst das Konto der Kundin Steffi holen:
		
		Konto kundenKonto;
		
		kundenKonto = testKunde.getMeinKonto();
		
		//2. Schritt: Den Kontostand des Kontos von Steffi abfragen
		
		double kontoStand = kundenKonto.getKontoStand();
		
		System.out.println("Kontostand von Steffi: " +kontoStand);
		
		//Testen Sie die erweiterte Klasse Kunde in der Startklasse für die Eigenschaft Schliessfach
		//////4.6.1.1 Übung Assoziation ////////
		
		Schliessfach testSchliessfach = new Schliessfach();
		testSchliessfach.setNummer(1234567);
		testSchliessfach.setMiete(199.8);
		
		testKunde.setSchliessfach(testSchliessfach);
		System.out.println("Nummer fuer Schliessfach von Steffi: " +testKunde.getSchliessfach().getNummer());
		System.out.println("Miete fuer Schliessfach von Steffi: " + testKunde.getSchliessfach().getMiete());
		
		
		/////////////////////////////////////////////////////////////////
		

	}
	
	

}
