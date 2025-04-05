class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee: " + name + ", Salary: $" + salary);
    }
}

class Manager extends Employee {
    protected String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void displayManagerInfo() {
        displayDetails();
        System.out.println("Department: " + department);
    }
}

class Director extends Manager {
    private double bonus;

    public Director(String name, double salary, String department, double bonus) {
        super(name, salary, department);
        this.bonus = bonus;
    }

    public void displayDirectorInfo() {
        displayManagerInfo();
        System.out.println("Annual Bonus: $" + bonus);
    }
}

public class MH2{
    public static void main(String[] args) {
        Director director = new Director("Alice", 100000, "IT", 20000);
        director.displayDirectorInfo();
    }
}
