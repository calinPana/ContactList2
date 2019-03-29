import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        Map<String, Contact> contacts = new TreeMap<>();
        //ca sa le sortez dupa lastName, trebuie sa fac un comparator pentru TreeMap

//        try {
//            Contact c3 = Contact.addContact();
//            contacts.put(c3.getFullName(), c3);
//        } catch (Exception e) {
//            System.out.println("This is not a valid email");
//        }


        // printContacts(contacts);

        //File f = new File("resources\\contacts\\contacts.txt");
        //System.out.println("Absolute path: " + f.getAbsolutePath());

try readFile(Contacts.txt);

//        try (BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\JavaUser\\Jademy\\Contacts.txt" ))) {
//            String sCurrentLine = "";
//
//            String header = in.readLine();
//
//            while ((sCurrentLine = in.readLine()) != null) {
//                String[] parts = sCurrentLine.split("," );
//                // for (int i = 0; i < parts.length; i++) {
//                // System.out.print(parts[i]);
//                // System.out.println();
//                // }
//                String lastName = parts[0];
//                String firstName = parts[1];
//                String phoneNumber = parts[2];
//                String email = parts[3];
//                Contact contact = new Contact(firstName, lastName, phoneNumber, email);
//                contacts.put(contact.getFullName(), contact);
//            }
//        } catch (IOException e) {
//            System.out.println("The file doesn't exist" );
//        }

//        try {
//            Contact c3 = Contact.addContact();
//            contacts.put(c3.getFullName(), c3);
//        } catch (Exception e) {
//            System.out.println("This is not a valid email");
//        }

        try {
            writeFile(contacts);
        } catch (IOException e) {
            System.out.println("There is no such file" );
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
        for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
            Contact contact = entry.getValue();
            System.out.println(contact.getFullName());
            System.out.println(contact.getPhoneNumber());
            System.out.println(contact.getEmail());
            System.out.println();
        }
    }





    public static void readFile(File file) throws IOException {
        try (BufferedReader in = new BufferedReader(new FileReader(file.getAbsolutePath()))) {
            String sCurrentLine = "";
            String header = in.readLine();
            while ((sCurrentLine = in.readLine()) != null) {
                String[] parts = sCurrentLine.split("," );
                for (int i = 0; i < parts.length; i++) {
                    System.out.print(parts[i]);
                    System.out.println();
                }
                String lastName = parts[0];
                String firstName = parts[1];
                String phoneNumber = parts[2];
                String email = parts[3];
            }
        } catch (IOException e) {
            System.out.println("The file doesn't exist" );
        }
    }





        public static void writeFile (Map < String, Contact > contacts) throws IOException {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\JavaUser\\Jademy\\Contacts.txt" )));
            out.write("LastName,FirstName,PhoneNumber,Email" );
            out.println();
            for (Contact c : contacts.values()) {
                String contact = c.getLastName() + "," + c.getFirstName() + "," + c.getPhoneNumber() + "," + c.getEmail();
                out.write(contact);
                out.println();
            }
            out.flush();
        }

//    class SortByLastName implements Comparator<Contact> {
//        public int compare(Contact a, Contact b) {
//            return a.getLastName().compareTo(b.getLastName());
//        }
//    }
    }

//LastName,FirstName,PhoneNumber,Email
//Popa,Andrei,1234567890,andrei.popa@gmail.com
//Popescu,Ion,0987654321,ion.popescu@yahoo.com
//Zzzz,Jordi,1357924680,jordi.zzzz@hotmail.com
//Aaaa,Nuria,2468013579,nuria.aaaa@aol.com