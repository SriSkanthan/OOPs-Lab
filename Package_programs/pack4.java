import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class pack4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Random rand = new Random(); 

        int[] numbers = new int[5];
        System.out.print("Generated numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = rand.nextInt(50) + 1;
            System.out.print(numbers[i] + " ");
        }

        System.out.print("\nGuess any number from above: ");
        int guess = sc.nextInt(); 

        boolean won = false;
        for (int num : numbers) {
            if (num == guess) {
                won = true;
                break;
            }
        }

        try {
            FileWriter fw = new FileWriter("game_result.txt", true);
            fw.write("Guess: " + guess + " | " + (won ? "WIN 🎉" : "LOSE ❌") + "\n");
            fw.close();
            System.out.println("Result saved to file.");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        sc.close();
    }
}
