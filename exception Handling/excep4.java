class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
public class excep4{
    public static void main(String[] args) {
        try {
            int a = 5 / 0; // ArithmeticException
            int[] arr = new int[2];
            System.out.println(arr[10]); // ArrayIndexOutOfBoundsException
            throw new CustomException("Custom Exception Triggered");
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        } catch (CustomException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
