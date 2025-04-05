class CoffeeMachine {
    private int sugarLevel;     
    private int milkLevel;      
    private boolean isEspresso;

    public void setPreferences(int sugar, int milk, boolean espresso) {
        if (sugar >= 0 && sugar <= 5 && milk >= 0 && milk <= 5) {
            sugarLevel = sugar;
            milkLevel = milk;
            isEspresso = espresso;
        }
    }

    public String brew() {
        String base = isEspresso ? "Espresso" : "Regular Coffee";
        return base + " with " + sugarLevel + " sugar(s) and " + milkLevel + " milk level.";
    }
}

public class encap1 {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        machine.setPreferences(2, 3, true);
        System.out.println(machine.brew());
    }
}
