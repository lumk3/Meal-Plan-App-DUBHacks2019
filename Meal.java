import java.io.*;
import java.util.*;

public class Meal {
    private String name;
    private double price;
    private ArrayList<String> ingredients;
    private boolean containsCommonAllergens;
    private int calories;

    public Meal(String name, double price, ArrayList<String> ingredients,
                boolean containsCommonAllergens, int calories) {
       this.name = name;
       this.price = price;
       this.ingredients = new ArrayList<>();
       this.containsCommonAllergens = containsCommonAllergens;
       this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return Math.round(price * 100.0) / 100.0;
    }

    public int getCalories() {
        return calories;
    }

    public void addIngredient(String ingredient) {
        if (!ingredients.contains(ingredient)) {
            ingredients.add(ingredient);
        }
    }

    public void removeIngredient(String ingredient) {
        ingredients.remove(ingredient);
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public boolean isContainsCommonAllergens() {
        return containsCommonAllergens;
    }

    public int getCalories() {
        return calories;
    }
}
