public class Main {
    public static void main(String[] args) {
        Order o1 = new Order(new PaypalPayment());
        o1.checkout(150.0);
        Order o2 = new Order(new CreditCardPayment());
        o2.checkout(250.0);
    }
}
