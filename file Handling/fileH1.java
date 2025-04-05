import java.io.*;
import java.util.Scanner;
public class fileH1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to write to the file:");
        String userInput = scanner.nextLine();
        try {
            FileWriter writer = new FileWriter("fileH1.txt");
            writer.write("User Input: " + userInput + "\nJava File Handling Example.");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}