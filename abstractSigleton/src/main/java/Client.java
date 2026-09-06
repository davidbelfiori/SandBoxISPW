import abstractProduct.Aula;

public class Client {
    public static void main(String[] args) {
        abstractFactory factory = abstractFactory.getFactory("memory");
        Aula aula = factory.createAula();
        aula.mostrarInformacion();

        abstractFactory factory1 = abstractFactory.getFactory("jdbc");
        Aula aula1 = factory1.createAula();
        aula1.mostrarInformacion();


    }
}
