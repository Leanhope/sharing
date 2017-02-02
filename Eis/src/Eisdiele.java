public class Eisdiele {

    public Eissorte[] eissorten() {
        return Eissorte.values();  
    }

    public Eis bestellen(int kugelanzahl, Garnierung garnierung,
            Verpackung verpackung) {
        return new Eis(kugelanzahl, garnierung, verpackung);
    }

    public double berechnePreis(Eis eis) {
        return eis.berechnePreis();
    }

    public static void main(String[] args) {
        Eisdiele luigi = new Eisdiele();
        Eis eis = luigi.bestellen(3, Garnierung.SAHNE, Verpackung.TUETE);
        eis.fuegeHinzu(new Eiskugel(Eissorte.VANILLE));
        eis.fuegeHinzu(new Eiskugel(Eissorte.BANANE));
        eis.fuegeHinzu(new Eiskugel(Eissorte.VANILLE));
        System.out.println("Das Eis kostet " + luigi.berechnePreis(eis)+ "€");
    }
}