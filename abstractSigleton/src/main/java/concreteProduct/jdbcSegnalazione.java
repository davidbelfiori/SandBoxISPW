package concreteProduct;

import abstractProduct.Segnalazione;

public class jdbcSegnalazione extends Segnalazione {
    @Override
    public void mostrarInformacion() {
        System.out.println("Segnalazione de JDBC");
    }
}
