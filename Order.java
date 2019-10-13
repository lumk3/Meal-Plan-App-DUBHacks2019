public class Order {
    private Meal meal;
    private int quantity;
    private String time;
    private boolean addToCart;
    private boolean addToCalendar;

    public Order(Meal meal, int quantity, String time, boolean addToCart, boolean addToCalendar) {
        this.meal = meal;
        this.quantity = quantity;
        this.time = time;
        this.addToCart = addToCart;
        this.addToCalendar = addToCalendar;

        if (addToCart) {
            addToCalendar = true;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTime() {
        return time;
    }

    public boolean isAddToCart() {
        return addToCart;
    }

    public boolean isAddToCalendar() {
        return addToCalendar;
    }

    public double orderTotal() {
        return Math.round((meal.price * quantity) * 100.0) / 100.0;
    }
}