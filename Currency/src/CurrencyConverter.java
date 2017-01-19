import java.util.Scanner;

public enum CurrencyConverter {
    USD (1.00),
    EUR (1.39),
    CAD (0.90),
    AUD (0.90),
    GBP (1.66);
	
	private final double kurs;
	
	CurrencyConverter(double kurs){
		this.kurs = kurs;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a Currency to convert to: ");
		String s = sc.next();
		System.out.println("Please enter an Amount to convert: ");
		int n = sc.nextInt();
		
		sc.close();
		
		CurrencyConverter currency = CurrencyConverter.valueOf(s);
		
		switch(currency){
		case USD:
			System.out.println(n + " USD are " + n * USD.kurs + " " + currency);
			break;
		case EUR:
			System.out.println(n + " USD are " + n * EUR.kurs + " " + currency);
			break;
		case CAD:
			System.out.println(n + " USD are " + n * CAD.kurs + " " + currency);
			break;
		case AUD:
			System.out.println(n + " USD are " + n * AUD.kurs + " " + currency);
			break;
		case GBP:
			System.out.println(n + " USD are " + n * GBP.kurs + " " + currency);
			break;
		}
	}
}
