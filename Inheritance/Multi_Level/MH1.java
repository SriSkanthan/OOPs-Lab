class Employee {
    protected String name;
    protected int empID;
    protected double salary;

    public Employee(String name, int empID, double salary) {
        this.name = name;
        this.empID = empID;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empID + " | Name: " + name + " | Salary: $" + salary);
    }
}

class Manager extends Employee {
    protected String department;

    public Manager(String name, int empID, double salary, String department) {
        super(name, empID, salary);
        this.department = department;
    }

    public void manageTeam() {
        System.out.println(name + " is managing the " + department + " department.");
    }
}

class Director extends Manager {
    private double budget;

    public Director(String name, int empID, double salary, String department, double budget) {
        super(name, empID, salary, department);
        this.budget = budget;
    }

    public void allocateBudget() {
        System.out.println(name + " allocated a budget of $" + budget + " for " + department);
    }
}

public class MH1{
    public static void main(String[] args) {
        Director director = new Director("Alice", 101, 120000, "IT", 500000);
        director.displayDetails();
        director.manageTeam();
        director.allocateBudget();
    }
}
