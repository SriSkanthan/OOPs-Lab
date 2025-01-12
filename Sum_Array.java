import java.util.Scanner;

public class Sum_Array {
    public static void main(String[] arg){
        Scanner input= new Scanner(System.in);

        int i;
        int[] arr= new int[10];
        System.out.println("Enter 10 Array Values ");
        for(i=0;i<10;i++){
                arr[i] = input.nextInt();
        }
        int sum = 0;
        
        for(int a : arr){
            sum+=a;
        }
        System.out.println("Sum of array elements = "+sum);

        input.close();
    }
}