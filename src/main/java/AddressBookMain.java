public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        // Sample Contact Object (for UC1 validation)
        Contact contact = new Contact(
                "Prajwal",
                "Thorat",
                "MG Road",
                "Chennai",
                "Tamil Nadu",
                "600001",
                "9876543210",
                "prajwal@email.com"
        );

        System.out.println(contact);
    }
}