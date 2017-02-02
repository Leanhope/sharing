
public enum Zinssatz {
	FESTGELDKONTO(1.5),
	GIROKONTOPOSITIV(0.2),
	GIROKONTONEGATIV(-2.0),
	KREDITKARTEUNLIMITED(0.5),
	KREDITKARTELIMITED(0.5);
	
	private final double zinssatz;
	
	
	Zinssatz(double zinssatz){
		this.zinssatz = zinssatz;	
	}
	
	public double getZinssatz(){
		return this.zinssatz;
	}
}
