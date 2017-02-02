
public class Festgeldkonto extends Bankkonto{
	
	int laufzeit;
		
	public Festgeldkonto(String inhaber, double kontostand, double zinssatz, int laufzeit){
		super(inhaber, kontostand, zinssatz);
		this.laufzeit = laufzeit;
	}
	public Festgeldkonto(String inhaber, double zinssatz, int laufzeit){
		super(inhaber, zinssatz);
		this.laufzeit = laufzeit;
	}
	
	@Override
	public void auszahlung(double betrag){
		System.out.println("DAS IST EIN FESTGELDKONTO!!");
	}
}
