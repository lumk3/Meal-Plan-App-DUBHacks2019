import java.util.*;

public class Filter {
   private ArrayList<Meal> meals;
   
   public Filter(ArrayList<Meal> meals) {
      this.meals = meals;
   }
   
   public ArrayList<Meal> checkAllergies() {
     ArrayList<Meal> noAllergens = new ArrayList<>();
     for (Meal meal : meals){
         if (!meal.containsCommonAllergens) {
            noAllergens.add(meal);
         }
      }
      return noAllergens;
   }
   
   public double[] priceLowHigh() {
      int numMeals = meals.size();
      double[] prices = new double[numMeals];
      for (int i = 0; i < numMeals; i++) {
         double price = meals.get(i).price;
         prices [i] = price;
      }
      return Array.sort(prices);
   }
}