import abstractProduct.Aula;
import abstractProduct.Segnalazione;
import abstractProduct.User;
import concreteProduct.*;

public class jdbcFactory extends abstractFactory {


    @Override
    public Aula createAula() {
        return new jdbcAula();
    }

    @Override
    public Segnalazione createSegnalazione() {
        return new jdbcSegnalazione();
    }

    @Override
    public User createUser() {
        return new jdbcUser();
    }
}
