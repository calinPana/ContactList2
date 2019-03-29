import java.io.*;
import java.nio.file.Path;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Agenda {
    Map<String, Contact> contacts = new TreeMap<>();
    Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("Choose an option:" );
        System.out.println("1. Create a backup file" );
        System.out.println("2. View backup file details" );
        System.out.println("3. Get a backup file" );
        System.out.println("4. Delete a backup file" );
    }

    public void createBackupFile(Map<String, Contact> contacts) throws IOException {

        File file = new File("Backups/backup_" + System.currentTimeMillis() + ".txt" );
        file.getParentFile().mkdirs();

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));

    }

    public void viewBackupFileDetails(Map<String, Contact> contacts) {
        //afisez informatii despre backup-uri, am acces la date modified etc.
        File folder = new File("C:\\Users\\JavaUser\\Jademy\\Backups" );
        for (int i=0; i<folder.listFiles(); i++) {
            System.out.println(i+1 + " " + folder.listFiles()[i].getName());
            System.out.println(folder.listFiles()[i].lastModified());
        }
    }

    public void getBackupFile(Map<String, Contact> contacts) {
        System.out.println("Choose one of the backup files");
        int option = sc.nextInt();
        File folder = new File("C:\\Users\\JavaUser\\Jademy\\Backups" );
        //try()
        folder.listFiles()[option-1]


        }

        public void deleteBackupFile(Map<String,Contact> contacts){
            System.out.println("Which one would you like to delete?");

        }
    }



