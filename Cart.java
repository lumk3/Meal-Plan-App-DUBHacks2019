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

    public void removeOrder(Order order) {
        orders.remove(order);
    }
}
