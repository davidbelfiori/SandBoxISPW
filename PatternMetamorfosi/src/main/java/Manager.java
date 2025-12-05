// Manager.java
public class Manager extends Impiego {

    public Manager(String descrizione) {
        super(descrizione);
    }

    @Override
    public void svolgiCompiti() {
        System.out.println("Gestisco il team e coordino i progetti");
    }

    public void organizzaRiunione() {
        System.out.println("Organizzo una riunione di team");
    }

    public void assegnaCompiti() {
        System.out.println("Assegno compiti ai membri del team");
    }
}
