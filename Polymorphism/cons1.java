class Student {
    String name;
    int age;
    int[] marks;
    double average;
    char grade;

    Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;

        calculateAverage();
        assignGrade();
    }

    void calculateAverage() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        average = total / (double) marks.length;
    }

    void assignGrade() {
        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else
            grade = 'F';
    }

    void displayDetails() {
        System.out.println("=== Student Details ===");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("  Subject " + (i+1) + ": " + marks[i]);
        }
        System.out.println("Average: " + average);
        System.out.println("Grade  : " + grade);
    }
}

public class cons1{
    public static void main(String[] args) {
        int[] marks = {85, 78, 92};
        Student s1 = new Student("Alex", 18, marks);
        s1.displayDetails();
    }
}
