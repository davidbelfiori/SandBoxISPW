package concreteProduct;

import abstractProduct.Aula;

public class jdbcAula extends Aula {
    @Override
    public void mostrarInformacion() {
        System.out.println("Aula de JDBC");
    }
}
