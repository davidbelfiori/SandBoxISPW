import abstractProduct.Aula;
import abstractProduct.Segnalazione;
import abstractProduct.User;
import concreteProduct.memoryAula;
import concreteProduct.memorySegnalazione;
import concreteProduct.memoryUser;

public class memoryFactory extends abstractFactory {


    @Override
    public Aula createAula() {
        return new memoryAula();
    }

    @Override
    public Segnalazione createSegnalazione() {
        return new memorySegnalazione();
    }

    @Override
    public User createUser() {
        return new memoryUser();
    }
}
