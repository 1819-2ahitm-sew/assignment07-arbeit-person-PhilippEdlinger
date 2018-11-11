import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Erstelle das Array
        Person[] personen ;
        final String FILENAME = "personen.csv";

        //Zähle die Zeilen in der Datei
        int zeilenanZahl = countFile(FILENAME) - 1;


        personen = new Person[countFile(FILENAME)];

    readFile("personen.csv", personen);
      

        //Ausgabe am Bildschirm
        for(int i = 0; i < personen.length-1; i++){
            System.out.println(personen[i].getVorname()+ " "+ personen[i].getNachname());
        }

    }

    private static void readFile(String filename, Person[] liste ){


        try( Scanner scanner = new Scanner (new FileReader(filename))){
            scanner.nextLine();

            int i = 0;
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String [] elements = line.split(";");
                Person p = new Person(elements[0], elements[1]);
                liste[i] = p;
                //System.out.println(p.getVorname() + " " + p.getNachname());
                i++;
            }
        }

        catch (FileNotFoundException e){
            System.err.println(e.getMessage());
        }
    }


    private static int countFile (String filename){
        int NotePad = 0;

        try (Scanner scanner =  new Scanner(new FileReader(filename))) {
            while (scanner.hasNextLine()){
                NotePad++;
                scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return NotePad;
    }
}
