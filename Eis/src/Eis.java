
public class Eis {

    private int kugelanzahl;
    private Eiskugel[] kugeln;
    private Garnierung garnierung;
    private Verpackung verpackung;

    public Eis(int gesamtKugelAnzahl, Garnierung garnierung,
            Verpackung verpackung) {
        this.kugelanzahl = 0;
        this.kugeln = new Eiskugel[gesamtKugelAnzahl];
        this.garnierung = garnierung;
        this.verpackung = verpackung;
    }

    public boolean fuegeHinzu(Eiskugel kugel) {
        if (kugelanzahl < kugeln.length) {
            kugeln[kugelanzahl] = kugel;
            ++kugelanzahl;
            return true;
        } else {
            return false;
        }
    }

    public double berechnePreis() {
        double preis = kugelanzahl;
        switch (garnierung) {
        case SAHNE: 
        	preis += 0.7;
        	break;
        case SCHOKOLADENGLASUR:
        	preis += 0.5;
        	break;
        case BEIDE:
        	preis += 1.2;
        }
        return preis;
    }
}