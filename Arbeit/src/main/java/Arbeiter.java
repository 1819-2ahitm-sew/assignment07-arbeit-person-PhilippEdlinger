public class Arbeiter extends Arbeitnehmer {

    private double stundenlohn;

    public Arbeiter(String beruf , String arbeitGeber, double stundenlohn ){
        super(beruf, arbeitGeber);
        setStundenlohn(stundenlohn);
    }

    @Override
    public double getEntgelt() {
        return getStundenlohn() * 40;
    }

    @Override
    public String toString() {
        return "Arbeiter: Bei dem Arbeitgeber "+ getArbeitGeber() +" verdient "  + getEntgelt() ;
    }

    // Getter und Setter
    public double getStundenlohn() {
        return stundenlohn;
    }

    public void setStundenlohn(double stundenlohn) {
        this.stundenlohn = stundenlohn;
    }



}
