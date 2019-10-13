public class Order {
    private Meal meal;
    private int quantity;
    private int pickUpHour;
    private int pickUpMinute;
    private boolean amPM;
    private boolean addToCart;
    private boolean addToCalendar;

    public Order(Meal meal, int quantity, int pickUpHour, int pickUpMinute,
                 boolean amPM, boolean addToCart, boolean addToCalendar) {
        this.meal = meal;
        this.quantity = quantity;
        this.pickUpHour = pickUpHour;
        this.pickUpMinute = pickUpMinute;
        this.amPM = amPM;
        this.addToCart = addToCart;
        this.addToCalendar = addToCalendar;

        if (addToCart) {
            addToCalendar = true;
        }
    }


}