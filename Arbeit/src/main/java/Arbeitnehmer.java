
import java.util.Scanner;

abstract public class Arbeitnehmer {

    private String beruf;
    private String arbeitGeber;

    abstract public double getEntgelt();

    public  Arbeitnehmer(){

    }


    public  Arbeitnehmer(String beruf , String arbeitGeber){
        setBeruf(beruf);
        setArbeitGeber(arbeitGeber);
    }


    // Getter und Setter

    public String getBeruf() {
        return beruf;
    }

    public void setBeruf(String beruf) {
        this.beruf = beruf;
    }

    public String getArbeitGeber() {
        return arbeitGeber;
    }

    public void setArbeitGeber(String arbeitGeber) {
        this.arbeitGeber = arbeitGeber;
    }

    public static void main(String[] args) {

        boolean ending = false;
        Scanner sc = new Scanner(System.in);
        String [] liste = new String[100];
        String choice;

        System.out.println("Befehle");
        System.out.println("1\t-\tEingabe\teines\tArbeiters \n" +
                "2\t-\tEingabe\teines\tAngestelltens \n" +
                "3\t-\tAusgabe\tder\tListe\tam\tBildschirm \n" +
                "-----------------------------------------------");


        for (int i = 0; ending != true ; i++){
            Arbeitnehmer person;
            String beruf;
            String arbeitGeber;
            double stundenlohn;

            System.out.print("Welchen Befehl möchten Sie Ausführen? : ");
            choice = sc.nextLine();

            if( choice.equals("1")){
                System.out.print("Beruf             : ");
                beruf = sc.nextLine();
                System.out.print("Arbeitergeber     : ");
                arbeitGeber = sc.nextLine();
                System.out.print("Studenlohn        : ");
                stundenlohn  = sc.nextDouble();
                person = new Arbeiter(beruf, arbeitGeber ,stundenlohn );

                liste[i] = person.toString();

            }

            if( choice.equals("2")){
                System.out.print("Beruf             : ");
                beruf = sc.nextLine();
                System.out.print("Arbeitergeber     : ");
                arbeitGeber = sc.nextLine();
                System.out.print("Studenlohn        : ");
                stundenlohn  = sc.nextDouble();
                person = new Angestellter(beruf, arbeitGeber ,stundenlohn );

                liste[i] = person.toString();
            }

            if (choice.equals("3")) {
                boolean stop = false;
                System.out.println("");
                for (int j = 0; stop != true; j++) {

                    if (liste[j] != null) {
                        System.out.println(liste[j]);
                    }if(liste[j] == null) {
                        stop = true;
                    }
                }
            }

        }


    }
}
