import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        addressBook.addContact();

        System.out.println("Enter name to edit:");
        String editName = scanner.nextLine();
        addressBook.editContact(editName);

        System.out.println("Enter name to delete:");
        String deleteName = scanner.nextLine();
        addressBook.deleteContact(deleteName);
    }
}