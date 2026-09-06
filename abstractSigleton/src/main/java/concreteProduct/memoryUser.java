package concreteProduct;

import abstractProduct.User;

public class memoryUser extends User {
    @Override
    public void mostrarInformacion() {
        System.out.println("Usuario de memoria");
    }
}
