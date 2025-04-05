import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class fileH3 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("fileH1.txt", true);
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            writer.write("\n[" + now.format(formatter) + "] Appending new data to the file.");
            writer.close();
            System.out.println("Data appended successfully with timestamp.");
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}