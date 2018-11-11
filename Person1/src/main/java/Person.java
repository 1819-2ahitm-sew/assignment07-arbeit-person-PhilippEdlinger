public  class Person extends main {



    private String vorname;
    private String nachname;

    public Person(){

    }

    public Person (String vorname ,String nachname){
        setVorname(vorname);
        setNachname(nachname);
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Override
    public String toString(){
    return "test";
    }

}
