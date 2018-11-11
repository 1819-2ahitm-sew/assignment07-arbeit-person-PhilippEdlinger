public class Schueler extends Person {

    private String schule;
    private String klasse;
    private int katalogNr;


    @Override
    public String toString() {
        return "Schüler: " + getVorname() +" "+ getNachname()  + " besucht die " +
                getSchule() +" in der Klasse "+ getKlasse() +" mit der Katalognr. " + getKatalogNr() + "\n" ;
    }

    public Schueler(String vorname, String nachname ){
        super(vorname,nachname);
    }




    //Getter und Setter

    public String getSchule() {
        return schule;
    }

    public void setSchule(String schule) {
        this.schule = schule;
    }

    public String getKlasse() {
        return klasse;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }

    public int getKatalogNr() {
        return katalogNr;
    }

    public void setKatalogNr(int katalogNr) {
        this.katalogNr = katalogNr;
    }
}
