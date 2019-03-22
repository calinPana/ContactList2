import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {


        Map<String, Contact> contacts = new TreeMap<>();
        //ca sa le sortez dupa lastName, trebuie sa fac un comparator pentru TreeMap

        // Contact c1 = new Contact("Ion", "Popescu", "0987654321");
        // Contact c2 = new Contact("Andrei", "Popa", "1234567890");

        // contacts.put(c1.getFullName(), c1);
        // contacts.put(c2.getFullName(), c2);

//        try {
//            Contact c3 = Contact.addContact();
//            contacts.put(c3.getFullName(), c3);
//        } catch (Exception e) {
//            System.out.println("This is not a valid email");
//        }

        //Collections.sort(contacts, new SortByLastName());

        printContacts(contacts);

        //File f = new File("resources\\contacts\\contacts.txt");
        //System.out.println("Absolute path: " + f.getAbsolutePath());


        try (BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\JavaUser\\Bootcamp\\Contacts.txt"))) {
            String sCurrentLine = "";
            while (!in.readLine().equals("End")) {
                sCurrentLine = in.readLine();
                String[] parts = sCurrentLine.split(",");
                for (int i = 0; i < parts.length; i++) {
                    System.out.print(parts[i]);
                    System.out.println();
                }
                String lastName = parts[0];
                String firstName = parts[1];
                String phoneNumber = parts[2];
                String email = parts[3];
                Contact contact = new Contact(firstName, lastName, phoneNumber, email);
                contacts.put(contact.getFullName(), contact);
            }
        } catch (IOException e) {
            System.out.println("The file doesn't exist");
        }
        printContacts(contacts);

    }


//    public static void printAgenda(List<Contact> agenda) {
//
//        System.out.println("Last name" + " First name" + " Phone number");
//
//        System.out.println();
//
//        for (int i = 0; i < agenda.size(); i++) {
//            System.out.println(agenda.get(i).getLastName() + " " + agenda.get(i).getFirstName() +
//                    " " + agenda.get(i).getPhoneNumber());
//        }
//    }

    public static void printContacts(Map<String, Contact> contacts) {
        for (Contact value : contacts.values()) {
            System.out.println(value.getFullName());
            System.out.println(value.getPhoneNumber());
            System.out.println();
        }
    }

    class SortByLastName implements Comparator<Contact> {
        public int compare(Contact a, Contact b) {
            return a.getLastName().compareTo(b.getLastName());
        }
    }
}
