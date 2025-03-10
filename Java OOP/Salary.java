class Employee {
    double baseSalary = 50000;
    void addBonus(double bonus) {
        baseSalary += bonus;
    }
    void displaySalary() {
        System.out.println("Total Salary: " + baseSalary);
    }
}
public class Salary {
    public static void main(String[] args) {
        Employee emp = new Employee();
        for (int i = 0; i < 3; i++) {  // Adding bonus 3 times
            emp.addBonus(5000);
        }
        emp.displaySalary();
    }
}
