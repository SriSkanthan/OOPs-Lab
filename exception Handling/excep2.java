import java.util.Random;
public class excep2{
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = {1, 2, 3, 4, 5};
        int index = random.nextInt(10); // Generating random index
        try {
            System.out.println("Accessing index: " + index);
            System.out.println("Value: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Index out of bounds.");
        }
    }
}