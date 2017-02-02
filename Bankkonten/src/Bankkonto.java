
public class Bankkonto {

	protected String kontoinhaber;
	protected double kontostand;
	protected double zinssatz;
	protected int kontonummer;

	Bankkonto(String inhaber, double kontostand, double zinssatz){
		this.kontoinhaber = inhaber;
		this.kontostand = kontostand;
		this.zinssatz = zinssatz;
	}
	Bankkonto(String inhaber, double zinssatz){
		this.kontoinhaber = inhaber;
		this.kontostand = 0.0;
		this.zinssatz = zinssatz;
	}
	
	public void einzahlung(double betrag){
		this.kontostand += betrag;
	}
	
	public void auszahlung(double betrag){
		this.kontostand -= betrag;
	}
	
	public void kontostand(){
		System.out.println("Ihr aktueller Kontostand: " + this.kontostand);
	}
	
	public void kontostandZinsen(){
		double zinsen = (this.kontostand / 100) * this.zinssatz;
		System.out.println("Ihr Kontostand nach der nächsten Zinsperiode: " + (this.kontostand + zinsen));
	}
}
