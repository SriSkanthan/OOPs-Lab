class Fibonacci {
    void generate(int n) {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
public class Series {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        fib.generate(10);
    }
}
