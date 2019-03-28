import java.io.*;
import java.nio.file.Path;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Agenda {
    Map<String, Contact> contacts = new TreeMap<>();
    Scanner sc = new Scanner(System.in);

    public void menu(){
        System.out.println("Choose an option:");
        System.out.println("1. Create a backup file");
        System.out.println("2. View backup file details");
        System.out.println("3. Get a backup file");
        System.out.println("4. Delete a backup file");
    }

    public void createBackupFile (Map<String, Contact> contacts) throws IOException {

        File file = new File("Backups/backup_" + System.currentTimeMillis() + ".txt");
        file.getParentFile().mkdirs();

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));

    }

    public void viewBackupFileDetails (Map<String, Contact> contacts){
        //afisez informatii despre backup-uri, am acces la date modified etc.
    }




}
