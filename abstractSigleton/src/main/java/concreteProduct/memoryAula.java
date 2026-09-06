package concreteProduct;

import abstractProduct.Aula;

public class memoryAula extends Aula {
    @Override
    public void mostrarInformacion() {
        System.out.println("Aula de memoria");
    }
}
