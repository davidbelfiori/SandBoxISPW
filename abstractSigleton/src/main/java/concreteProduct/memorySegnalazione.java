package concreteProduct;

import abstractProduct.Segnalazione;

public class memorySegnalazione extends Segnalazione {
    @Override
    public void mostrarInformacion() {
        System.out.println("Segnalazione de memoria");
    }
}
