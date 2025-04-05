class Student {

    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void greet(String message) {
        System.out.println("Hi " + name + "! Message: " + message);
        printBadge(name);
    }

    void greet(int year) {
        System.out.println("Roll No: " + rollNumber + ", Admission Year: " + year);
        if (year < 2023) {
            System.out.println("Status: Senior Student");
        } else {
            System.out.println("Status: Junior Student");
        }
    }

    void printBadge(String name) {
        System.out.println("Generating badge for: " + name.toUpperCase());
    }
}

public class metOL2{
    public static void main(String[] args) {
        Student s1 = new Student("Sri", 101);
        s1.greet("Welcome to the AI Club!");
        s1.greet(2024);
    }
}
