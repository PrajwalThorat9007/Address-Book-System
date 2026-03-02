import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    private List<Contact> contactList = new ArrayList<>();

    public void addContact() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter Address:");
        String address = scanner.nextLine();

        System.out.println("Enter City:");
        String city = scanner.nextLine();

        System.out.println("Enter State:");
        String state = scanner.nextLine();

        System.out.println("Enter Zip:");
        String zip = scanner.nextLine();

        System.out.println("Enter Phone Number:");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter Email:");
        String email = scanner.nextLine();

        Contact contact = new Contact(firstName, lastName, address,
                city, state, zip, phoneNumber, email);

        contactList.add(contact);

        System.out.println("\nContact Added Successfully!");
    }

    public void editContact(String name) {

        Scanner scanner = new Scanner(System.in);
        boolean found = false;

        for (Contact contact : contactList) {

            if (contact.getFirstName().equalsIgnoreCase(name)) {

                System.out.println("Editing Contact: " + name);

                System.out.println("Enter New Address:");
                contact.setAddress(scanner.nextLine());

                System.out.println("Enter New City:");
                contact.setCity(scanner.nextLine());

                System.out.println("Enter New State:");
                contact.setState(scanner.nextLine());

                System.out.println("Enter New Zip:");
                contact.setZip(scanner.nextLine());

                System.out.println("Enter New Phone Number:");
                contact.setPhoneNumber(scanner.nextLine());

                System.out.println("Enter New Email:");
                contact.setEmail(scanner.nextLine());

                System.out.println("Contact Updated Successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact Not Found!");
        }
    }

    public void deleteContact(String name) {

        boolean removed = contactList.removeIf(
                contact -> contact.getFirstName().equalsIgnoreCase(name)
        );

        if (removed) {
            System.out.println("Contact Deleted Successfully!");
        } else {
            System.out.println("Contact Not Found!");
        }
    }
}