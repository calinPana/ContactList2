import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        Map<String, Contact> contacts = new TreeMap<>();
        //ca sa le sortez dupa lastName, trebuie sa fac un comparator pentru TreeMap

        Contact c1 = new Contact("Ion", "Popescu", "0987654321");
        Contact c2 = new Contact("Andrei", "Popa", "1234567890");

        contacts.put(c1.getFullName(), c1);
        contacts.put(c2.getFullName(), c2);

        Contact c3 = Contact.addContact();
        contacts.put(c3.getFullName(), c3);

        //Collections.sort(contacts, new SortByLastName());
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
            for (Contact value : contacts.values()){
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
