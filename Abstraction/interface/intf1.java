interface CookingRecipe {
    void prepareDish();
    String getIngredients();
}

class Pasta implements CookingRecipe {
    public void prepareDish() {
        System.out.println("Cooking Pasta: Boil water, add pasta, cook for 10 minutes.");
    }

    public String getIngredients() {
        return "Pasta, water, salt";
    }
}

class Soup implements CookingRecipe {
    public void prepareDish() {
        System.out.println("Making Soup: Boil water, add vegetables, simmer for 20 minutes.");
    }

    public String getIngredients() {
        return "Water, carrots, potatoes, onion";
    }
}

class Salad implements CookingRecipe {
    public void prepareDish() {
        System.out.println("Making Salad: Chop vegetables, add dressing, mix.");
    }

    public String getIngredients() {
        return "Lettuce, tomatoes, cucumber, olive oil, vinegar";
    }
}

public class intf1 {
    public static void main(String[] args) {
        CookingRecipe pasta = new Pasta();
        System.out.println("Pasta Ingredients: " + pasta.getIngredients());
        pasta.prepareDish();

        CookingRecipe soup = new Soup();
        System.out.println("Soup Ingredients: " + soup.getIngredients());
        soup.prepareDish();

        CookingRecipe salad = new Salad();
        System.out.println("Salad Ingredients: " + salad.getIngredients());
        salad.prepareDish();
    }
}
