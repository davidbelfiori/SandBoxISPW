public class Latte extends Decorator {
    public Latte(Bevanda bevanda) {
        super(bevanda);
    }

    @Override
    public String descrizione() {
        return bevanda.descrizione() + ", Latte";
    }

    @Override
    public double costo() {
        return bevanda.costo() + 0.5;
    }

}
