import abstractProduct.Aula;
import abstractProduct.Segnalazione;
import abstractProduct.User;

public abstract class abstractFactory {

    public static abstractFactory instance ;

    public static abstractFactory getFactory(String type) {
        switch (type) {
            case "memory":
                instance = new memoryFactory();
               break;
            case "jdbc":
                instance = new jdbcFactory();
                break;
            default:
                throw new IllegalArgumentException("Invalid factory type: " + type);
        }
        return instance;
    }

    public abstract Aula createAula();
    public abstract Segnalazione createSegnalazione();
    public abstract User createUser();
}
