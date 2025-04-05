import java.io.*;
public class fileH2{
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("fileH1.txt");
            BufferedReader br = new BufferedReader(reader);
            String line;
            int lineNumber = 1;
            while ((line = br.readLine()) != null) {
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}