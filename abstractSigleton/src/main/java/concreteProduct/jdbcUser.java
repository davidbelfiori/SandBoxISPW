package concreteProduct;

import abstractProduct.User;

public class jdbcUser extends User {

    @Override
    public void mostrarInformacion() {
        System.out.println("user de JDBC");
    }
}
