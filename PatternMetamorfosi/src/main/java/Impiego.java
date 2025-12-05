// Impiego.java
public abstract class Impiego {
    private String descrizione;

    public Impiego(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public abstract void svolgiCompiti();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + descrizione;
    }
}
