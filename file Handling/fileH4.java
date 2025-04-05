import java.io.*;
public class fileH4{
    public static void main(String[] args) {
        File file = new File("fileH1.txt");
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file. It might be in use.");
        }
    }
}
