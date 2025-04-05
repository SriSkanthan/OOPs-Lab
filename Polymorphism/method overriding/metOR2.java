class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateBonus() {
        return baseSalary * 0.05;
    }

    void showDetails() {
        System.out.println("Employee: " + name);
        System.out.println("Base Salary: ₹" + baseSalary);
        System.out.println("Bonus: ₹" + calculateBonus());
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, double baseSalary, int teamSize) {
        super(name, baseSalary);
        this.teamSize = teamSize;
    }

    @Override
    double calculateBonus() {
        double baseBonus = super.calculateBonus();
        return baseBonus + (teamSize * 500); 
    }

    @Override
    void showDetails() {
        System.out.println("Manager: " + name);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Base Salary: ₹" + baseSalary);
        System.out.println("Bonus with team incentives: ₹" + calculateBonus());
    }
}

public class metOR2{
    public static void main(String[] args) {
        Employee e = new Employee("Sri", 40000);
        Manager m = new Manager("Raj", 60000, 5);

        System.out.println("=== Employee Info ===");
        e.showDetails();

        System.out.println("\n=== Manager Info ===");
        m.showDetails();

        Employee ref = m;
        System.out.println("\n=== Using Polymorphic Reference ===");
        ref.showDetails();
    }
}
