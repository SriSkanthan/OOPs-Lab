class SmartFridge {
    private int appleCount;
    private int waterBottleCount;

    public void restockApples(int count) {
        if (count >= 0) appleCount += count;
    }

    public void takeBottle() {
        if (waterBottleCount > 0) waterBottleCount--;
    }

    public void restockWater(int count) {
        if (count >= 0) waterBottleCount += count;
    }

    public String getStatus() {
        return "Fridge contains " + appleCount + " apples and " + waterBottleCount + " bottles of water.";
    }
}

public class encap3{
    public static void main(String[] args) {
        SmartFridge fridge = new SmartFridge();
        fridge.restockApples(6);
        fridge.restockWater(4);
        fridge.takeBottle();
        System.out.println(fridge.getStatus());
    }
}
