public abstract class Decorator implements Bevanda {

    /**
     * Decorator è di tipo bevanda ma contiene al suo interno una bevanda
     * quindi è dello stesso tipo e contiene un suo stesso tipo
     * */
    Bevanda bevanda;
    Decorator(Bevanda bevanda) {
        this.bevanda = bevanda;
    }

    @Override
    public double costo() {
        return bevanda.costo();
    }

    @Override
    public String descrizione() {
        return bevanda.descrizione();
    }


}
