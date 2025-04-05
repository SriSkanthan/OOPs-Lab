import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class pack3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your journal entry:");
        String entry = sc.nextLine(); 

        String timeStampedEntry = "\n[" + new Date() + "]\n" + entry + "\n";

        try {
            FileWriter writer = new FileWriter("journal.txt", true); 
            writer.write(timeStampedEntry);
            writer.close();

            int wordCount = entry.trim().split("\\s+").length;
            System.out.println("Entry saved! Word Count: " + wordCount);
        } catch (IOException e) {
            System.out.println("Error saving entry: " + e.getMessage());
        }

        sc.close();
    }
}
