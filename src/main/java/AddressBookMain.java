import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Map<String, AddressBook> addressBookMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        boolean exitSystem = false;

        while (!exitSystem) {

            System.out.println("\nMain Menu:");
            System.out.println("1. Create New Address Book");
            System.out.println("2. Open Existing Address Book");
            System.out.println("3. Exit");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    System.out.println("Enter Address Book Name:");
                    String bookName = scanner.nextLine();

                    if (addressBookMap.containsKey(bookName)) {
                        System.out.println("Address Book already exists!");
                    } else {
                        addressBookMap.put(bookName, new AddressBook());
                        System.out.println("Address Book Created Successfully!");
                    }
                    break;

                case 2:
                    System.out.println("Enter Address Book Name:");
                    String existingBook = scanner.nextLine();

                    if (addressBookMap.containsKey(existingBook)) {
                        manageAddressBook(addressBookMap.get(existingBook), scanner);
                    } else {
                        System.out.println("Address Book Not Found!");
                    }
                    break;

                case 3:
                    exitSystem = true;
                    System.out.println("Exiting System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    private static void manageAddressBook(AddressBook addressBook, Scanner scanner) {

        boolean exitBook = false;

        while (!exitBook) {

            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Back to Main Menu");

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
                    exitBook = true;
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}