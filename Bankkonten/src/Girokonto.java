
public class Girokonto extends Bankkonto{
	
	double negativZins;
	
	public Girokonto(String inhaber, double kontostand, double zinssatz, double negativZins){
		super(inhaber, kontostand, zinssatz);
		this.negativZins = negativZins;
	}
	public Girokonto(String inhaber, double zinssatz, double negativZins){
		super(inhaber, zinssatz);
		this.negativZins = negativZins;
	}
	
	@Override
	public void kontostandZinsen(){
		if(this.kontostand < 0){
			double zinsen = (this.kontostand / 100) * this.negativZins;
			System.out.println("Ihr Kontostand nach der naechsten Zinsperiode: " + (this.kontostand - zinsen));
		}
		else{
			double zinsen = (this.kontostand / 100) * this.zinssatz;
			System.out.println("Ihr Kontostand nach der naechsten Zinsperiode: " + (this.kontostand + zinsen));
		}
	}
}
