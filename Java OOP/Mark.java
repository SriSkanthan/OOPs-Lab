import java.util.Scanner;
class Student {
    int marks[] = new int[3];
    void inputMarks(Scanner sc) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
        }
    }
    int getTotal() {
        int sum = 0;
        for (int m : marks) sum += m;
        return sum;
    }
    double getAverage() {
        return getTotal() / 3.0;
    }
}
public class Mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.inputMarks(sc);
        System.out.println("Total: " + student.getTotal());
        System.out.println("Average: " + student.getAverage());
    }
}
