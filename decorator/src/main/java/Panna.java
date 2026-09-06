public class Panna extends Decorator{
    Panna(Bevanda bevanda) {
        super(bevanda);
    }

    @Override
    public double costo() {
        return bevanda.costo()+1.5;
    }

    @Override
    public String descrizione() {
        return bevanda.descrizione()+" Panna";
    }
}
