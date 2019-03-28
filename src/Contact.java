import java.util.Objects;
import java.util.Scanner;

public class Contact implements Comparable<Contact> {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

//    public Contact(String firstName, String lastName, String phoneNumber) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.phoneNumber = phoneNumber;
//    }

    public Contact(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return lastName + " " + firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(firstName, contact.firstName) &&
                Objects.equals(lastName, contact.lastName) &&
                Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, phoneNumber);
    }

    public static Contact addContact() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("First name: ");
        String firstName = sc.next();
        System.out.println("Last name: ");
        String lastName = sc.next();
        System.out.println("Phone number: ");
        String phoneNumber = sc.next();
        System.out.println("Email: ");
        String email = sc.next();

        if (!email.contains("@")) {
            throw new Exception("This is not a valid email");
        }

        return new Contact(firstName, lastName, phoneNumber, email);

    }

    @Override
    public int compareTo(Contact o) {
        if (this.getLastName().equals(o.getLastName())) {
            return this.getFirstName().compareTo(o.getFirstName());
        }

        return this.getLastName().compareTo(o.getLastName());
    }


}