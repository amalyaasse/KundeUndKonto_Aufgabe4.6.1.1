package KundeUndKonto;

public class Kunde {

	public static void main(String[] args) {
		

	}
	
	private String name;
	
	//Anlegen eines Kontos für den Kunden
	
	private Konto meinKonto;
	
	

	//Erweitern Sie die Klasse Kunde dann so, dass jeder Kunde ein Schließfach haben kann
/////////////////Aufgabe 4.6.1.1///////////////////////////////////////////////////


	private Schliessfach schliessfach;
	
	public Schliessfach getSchliessfach() {
		return schliessfach;
	}

	public void setSchliessfach(Schliessfach schliessfach) {
		this.schliessfach = schliessfach;
	}
////////////////////////////////////////////////////////////////////	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Konto getMeinKonto() {
		return meinKonto;
	}

	public void setMeinKonto(Konto meinKonto) {
		this.meinKonto = meinKonto;
	}
	
	
	

}
