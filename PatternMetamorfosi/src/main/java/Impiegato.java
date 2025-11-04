// Impiegato.java
import java.util.ArrayList;
import java.util.List;

public class Impiegato {
    private String nome;
    private String cognome;
    private List<Impiego> impieghi;

    public Impiegato(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.impieghi = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public List<Impiego> getImpieghi() {
        return impieghi;
    }

    // Aggiungi un impiego
    public void aggiungiImpiego(Impiego impiego) {
        if (!impieghi.contains(impiego)) {
            impieghi.add(impiego);
            System.out.println(nome + " ha ora l'impiego: " + impiego);
        }
    }

    // Rimuovi un impiego
    public void rimuoviImpiego(Impiego impiego) {
        if (impieghi.remove(impiego)) {
            System.out.println(nome + " non ha più l'impiego: " + impiego);
        }
    }

    // Cambia impiego (promozione/cambio ruolo)
    public void cambiaImpiego(Impiego vecchioImpiego, Impiego nuovoImpiego) {
        rimuoviImpiego(vecchioImpiego);
        aggiungiImpiego(nuovoImpiego);
    }

    // Mostra tutti gli impieghi
    public void mostraImpieghi() {
        System.out.println("\n" + nome + " " + cognome + " - Impieghi:");
        if (impieghi.isEmpty()) {
            System.out.println("  Nessun impiego assegnato");
        } else {
            for (Impiego impiego : impieghi) {
                System.out.println("  - " + impiego);
            }
        }
    }

    @Override
    public String toString() {
        return nome + " " + cognome;
    }
}
