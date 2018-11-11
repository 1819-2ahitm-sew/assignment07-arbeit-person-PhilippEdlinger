public class Student extends Person {

    private String universitaet;
    private int matrikelNr;
    private  String studienfach;

    public Student(String vorname, String nachname ){
        super(vorname,nachname);
    }

    @Override
    public String toString() {
        return "Student: " + getVorname() + " "+getNachname() + " besucht die " + getUniversität() +"  mit der MartikelNr. " +getMatrikelNr() +" in dem Studienfach " +getStudienfach() ;
    }


    //Getter und Setter

    public String getUniversität() {
        return universitaet;
    }

    public void setUniversität(String universitaet) {
        this.universitaet = universitaet;
    }

    public int getMatrikelNr() {
        return matrikelNr;
    }

    public void setMatrikelNr(int matrikelNr) {
         this.matrikelNr = matrikelNr;
    }

    public String getStudienfach() {
        return studienfach;
    }

    public void setStudienfach(String studienfach)  {
        this.studienfach = studienfach;
    }
}
