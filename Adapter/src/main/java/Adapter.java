public class Adapter implements Target{
    private static final double EUR_TO_USD = 1.08;
    Adaptee a;
    public Adapter (Adaptee adaptee){
        this.a = adaptee;
    }


    @Override
    public double request(String idCliente,double importoEuro ) {
            Long customer = Long.parseLong(idCliente);
            double dollari = importoEuro*EUR_TO_USD;
            double tassaDollari = this.a.calculateTaxInDollars(customer, dollari);
            return tassaDollari / EUR_TO_USD;
    }
}
