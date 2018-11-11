import java.lang.reflect.Array;
import java.util.Scanner;

abstract public class Person {

    private String vorname;
    private String nachname;

    abstract public String toString();

    public Person() {

    }

    public Person(String vorname, String nachname) {
        setVorname(vorname);
        setNachname(nachname);
    }

    //Getter und Setter
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


    //Main
    public static void main(String[] args) {

        boolean ending = false;
        String choice;
        String[] liste = new String[100];
        Scanner sc = new Scanner(System.in);


        System.out.println("Befehle");
        System.out.println("1\t-\tEingabe\teines\tSchülers \n" +
                "2\t-\tEingabe\teines\tStudenten \n" +
                "3\t-\tAusgabe\tder\tListe\tam\tBildschirm \n" +
                "-----------------------------------------------");

        for (int i = 0; ending == false; i++) {
            Person person;


            System.out.print("Welchen Befehl möchten Sie Ausführen? : ");
            choice = sc.nextLine();

            if (choice.equals("1")) {
                System.out.print("Vorname   : ");
                String vornamePerson = sc.nextLine();
                System.out.print("Nachname  : ");
                String nachnamePerson = sc.nextLine();
                person = new Schueler(vornamePerson, nachnamePerson);

                System.out.print("Schule    : ");
                ((Schueler) person).setSchule(sc.nextLine());
                System.out.print("Klasse  : ");
                ((Schueler) person).setKlasse(sc.nextLine());
                System.out.print("Katalognummer   : ");
                ((Schueler) person).setKatalogNr(sc.nextInt());

                liste[i] = person.toString();


            }

            if (choice.equals("2")) {
                System.out.print("Vorname   : ");
                String vornamePerson = sc.nextLine();
                System.out.print("Nachname  : ");
                String nachnamePerson = sc.nextLine();
                person = new Student(vornamePerson, nachnamePerson);

                System.out.print("Universitaet   : ");
                ((Student) person).setUniversität(sc.nextLine());
                System.out.print("MartrikelNr.   : ");
                ((Student) person).setMatrikelNr(sc.nextInt());
                System.out.print("Studienfach    : ");
                ((Student) person).setStudienfach(sc.nextLine());

                liste[i] = person.toString();
            }

            if (choice.equals("3")) {
                boolean stop = false;
                System.out.println("");
                for (int j = 0; stop != true; j++) {

                    if (liste[j] != null) {
                        System.out.println(liste[j]);
                    } else {
                        stop = true;
                    }
                }
            }


        }


    }

}

