import java.io.*;
import java.util.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Locale;

public class Cart {
    private ArrayList<Order> orders;
    private double subTotal;

    public Cart(ArrayList<Order> orders) {
        this.orders = orders;
        for (Order order : orders) {
            subTotal += order.orderTotal();
        }
    }

    public double getSubTotal() {
        return subTotal;
    }

    public double grandTotal() {
        return Math.round((subTotal * 1.1) * 100.0) / 100.0;
    }

    public double tax() {
        return Math.round((subTotal * .1) * 100.0) / 100.0;
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public void toFile() throws FileNotFoundException {
        FileOutputStream fout = new FileOutputStream("cartSummary.json");

        PrintStream out = new PrintStream(fout);
        out.print("\'[{\"Cart\": {");

        for (int i = 0; i < orders.size(); i++) {
            Order currOrder = orders.get(i);
            Meal currMeal = currOrder.meal;
            ArrayList<String> ingredients = currMeal.ingredients;
            out.print("\"Order" + (i + 1) + "\": {\"Meal\": {\"name\": \"" + currOrder.meal.getName() + "\",");
            out.print("\"price\": " + currOrder.orderTotal() + ",");
            out.print("\"ingredients\": " + arrayListToString(ingredients) + ",");
            out.print("\"containsCommonAllergens: \"" + currMeal.isContainsCommonAllergens() + "\",");
            out.print("\"calores\": " + getCalories() + "},");
            out.print("\"quantity\": " + currOrder.getQuantity() + ",");
            out.print("\"time\": \"" + currOrder.getTime() + "\",");
            out.print("\"addToCart\": " + currOrder.isAddToCart() + ",");
            out.print("\"addToCalendar\": " +currOrder.isAddToCalendar() + "},");
        }
    }

    private String arrayListToString(ArrayList<String> arr) {
        String result = "[" + arr.get(0);
        for (int i  = 0; i < arr.size(); i++) {
            result = result + ",\"" + arr.get(i) + "\"";
        }
        return result = result + "]";
    }
}
