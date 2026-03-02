import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        addressBook.addContact();

        System.out.println("Enter name to edit:");
        String name = scanner.nextLine();

        addressBook.editContact(name);
    }
}