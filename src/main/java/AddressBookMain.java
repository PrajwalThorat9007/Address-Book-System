import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {

            System.out.println("\nChoose an Option:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    addressBook.addContact();
                    break;

                case 2:
                    System.out.println("Enter name to edit:");
                    addressBook.editContact(scanner.nextLine());
                    break;

                case 3:
                    System.out.println("Enter name to delete:");
                    addressBook.deleteContact(scanner.nextLine());
                    break;

                case 4:
                    addressBook.displayAllContacts();
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting Address Book...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}