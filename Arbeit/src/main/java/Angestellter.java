public class Angestellter extends Arbeitnehmer{

    private double gehalt;


    public Angestellter(String beruf , String arbeitGeber, double gehalt ){
        super(beruf, arbeitGeber);
        setGehalt(gehalt);
    }

    public double getEntgelt() {
        return getGehalt();
    }

    @Override
    public String toString() {
        return "Angestellter: Bei dem Arbeitgeber "+ getArbeitGeber() +" verdient "  + getEntgelt() ;
    }

    //Getter und Setter
    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }
}
