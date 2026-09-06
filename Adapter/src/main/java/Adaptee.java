public class Adaptee {


    // Metodo incompatibile: vuole parametri diversi e valuta in Dollari!
    public double calculateTaxInDollars(long customerCode, double amountDollars) {
        System.out.println("LOG: Calcolo imposte USA via sistema legacy...");
        return amountDollars * 0.20; // 20% di tasse
    }

}
