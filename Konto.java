package KundeUndKonto;

public class Konto {

	public static void main(String[] args) {

	}

	private double kontoStand;

	public void einzahlen(double einzahlungsBetrag) {
		kontoStand = kontoStand + einzahlungsBetrag;
	}

	public void abheben(double abhebungsBetrag) {
		kontoStand = kontoStand - abhebungsBetrag;
	}

	public double getKontoStand() {
		return kontoStand;
	}

	
	
	

}
