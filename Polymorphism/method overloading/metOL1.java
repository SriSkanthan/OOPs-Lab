class AdvancedCalculator {

    int calculate(int a, int b) {
        int result = a + b;
        logOperation("int", result);
        return result;
    }

    double calculate(double a, double b, double c) {
        double result = a + b + c;
        logOperation("double", result);
        return result;
    }

    void logOperation(String type, double result) {
        System.out.println("[INFO] Performed " + type + " addition. Result = " + result);
        if (result > 100) {
            System.out.println("[WARNING] Result exceeds 100!");
        }
    }
}

public class metOL1{
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();

        int intSum = calc.calculate(40, 65);           
        double doubleSum = calc.calculate(12.5, 23.0, 14.5); 

        System.out.println("Final Integer Sum: " + intSum);
        System.out.println("Final Double Sum: " + doubleSum);
    }
}
