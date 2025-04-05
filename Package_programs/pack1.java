import mathutils.Calculator; 

public class pack1{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("Square of 4 = " + calc.square(4));
        System.out.println("Cube of 2 = " + calc.cube(2));
    }
}
