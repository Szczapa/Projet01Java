import contacts.Person;
import contacts.Directory;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);   
    Directory directory = new Directory();

    boolean running = true;

    while(running){
       System.out.println("\n=== Gestionnaire de contacts ===");
            System.out.println("1. Ajouter un contact");
            System.out.println("2. Lister les contacts");
            System.out.println("3. Quitter");
            System.out.print("Votre choix : ");

            int choice = getValidatedInteger(scanner);

            switch(choice){
              case 1:
                    addContact(scanner, directory);
                    break;
              case 2:
                    listContacts(directory);
                    break;
              case 3:
                    running = false;
                    break;
              default : 
                  System.out.println("Mauvaise demande recommencer la séléction.");
            }
    }
    scanner.close();
    System.out.println("Hello World");
  }

  private static void addContact(Scanner scanner, Directory directory) {
        System.out.print("Entrez le nom : ");
        String name = scanner.nextLine();

        System.out.print("Entrez le numéro de téléphone : ");
        String phone = scanner.nextLine();

        Person person = new Person(name, phone);
        directory.addPerson(person);
        System.out.println("Contact ajouté avec succès !");
  }

    private static void listContacts(Directory directory) {
        System.out.println("\nListe des contacts :");
        System.out.println(directory);
    }

    private static int getValidatedInteger(Scanner scanner) {
        int number = -1;
        while (true) {
            try {
                String input = scanner.nextLine();
                number = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Veuillez entrer un entier valide : ");
            }
        }
        return number;
    }
}