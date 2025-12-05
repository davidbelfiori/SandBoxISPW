// Programmatore.java
public class Programmatore extends Impiego {

    public Programmatore(String descrizione) {
        super(descrizione);
    }

    @Override
    public void svolgiCompiti() {
        System.out.println("Scrivo codice e implemento funzionalità");
    }

    public void scriviCodice() {
        System.out.println("Sto scrivendo codice...");
    }

    public void faiDebugging() {
        System.out.println("Sto debuggando il codice...");
    }
}
