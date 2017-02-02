
public class KreditkarteUnlimited extends Bankkonto{

	int kreditkartenNummer;
	
	public KreditkarteUnlimited(String inhaber, double kontostand, double zinssatz){
		super(inhaber, kontostand, zinssatz);
	}
	public KreditkarteUnlimited(String inhaber, double zinssatz){
		super(inhaber, zinssatz);
	}
	
	@Override
	public void kontostandZinsen(){
		if(this.kontostand > 0){
			double zinsen = (this.kontostand / 100) * this.zinssatz;
			System.out.println("Ihr Kontostand nach der naechsten Zinsperiode: " + (this.kontostand + zinsen));
		}
	}
}
