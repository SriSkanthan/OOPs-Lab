class Pattern {
    void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class StarTri {
    public static void main(String[] args) {
        Pattern tp = new Pattern();
        tp.printPattern(5);
    }
}
