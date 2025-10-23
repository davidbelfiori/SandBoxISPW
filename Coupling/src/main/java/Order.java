public class Order {
    private PaymantMethod paymantMethod;

    public Order(PaymantMethod paymantMethod) {
        this.paymantMethod = paymantMethod;
    }

    public void checkout(double amount) {
        paymantMethod.processPayment(amount);
    }
}
