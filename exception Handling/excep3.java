import java.io.*;
public class excep3{
    public static void main(String[] args) {
        String fileName = "sample.txt";
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("File not found. Creating a new file...");
                file.createNewFile();
            }
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}