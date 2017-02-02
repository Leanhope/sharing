
public class KreditkarteLimited extends Bankkonto{
	
	int kreditkartenNummer;
	double auszahlungsLimit;
	
	public KreditkarteLimited(String inhaber, double kontostand, double zinssatz, double limit){
		super(inhaber, kontostand, zinssatz);
		this.auszahlungsLimit = limit;
	}
	public KreditkarteLimited(String inhaber, double zinssatz, double limit){
		super(inhaber, zinssatz);
		this.auszahlungsLimit = limit;
	}
	
	@Override
	public void auszahlung(double betrag){
		if (betrag > this.auszahlungsLimit){
			System.out.println("Auszahlungslimit ueberschritten.");
		}
		else{
			this.kontostand -= betrag;
		}
	}
	
}
