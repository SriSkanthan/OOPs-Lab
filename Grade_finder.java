import java.util.Scanner;

public class Grade_finder {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ur Mark : ");
        int mark = input.nextInt();
        if(mark<35)
            System.out.println("Fail...");
        
        else if(mark>=35 && mark<=100){
            if(mark>=85)
                System.out.println("Outstanding...");
            else
                System.out.println("Pass...");
        }
        else
            System.out.println("Inavalid Mark...");
        
        

        input.close();
    }
}
