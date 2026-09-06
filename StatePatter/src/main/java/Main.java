import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Creazione di una nuova segnalazione
        Segnalazione segnalazione = new Segnalazione(
                "S001",
                new Date(),
                "Proiettore rotto",
                "Prof. Rossi",
                "Il proiettore non si accende",
                "A1",
                "Edificio A",
                "Tecnico Bianchi"
        );

        System.out.println("Stato iniziale: " + segnalazione.getStato().getNomeStato());

        // Test transizione da APERTA a IN_LAVORAZIONE
        try {
            System.out.println("Tentativo di passaggio a IN_LAVORAZIONE...");
            segnalazione.getStato().vaiInLavorazione(segnalazione);
            System.out.println("Nuovo stato: " + segnalazione.getStato().getNomeStato());
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }

        // Test transizione da IN_LAVORAZIONE a CHIUSA
        try {
            System.out.println("Tentativo di chiusura segnalazione...");
            segnalazione.getStato().chiudi(segnalazione);
            System.out.println("Nuovo stato: " + segnalazione.getStato().getNomeStato());
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }

        // Test transizione non valida (es. da CHIUSA a IN_LAVORAZIONE o altro, dipendente dall'implementazione)
        // Creiamo una nuova segnalazione per testare l'errore da APERTA a CHIUSA direttamente
        System.out.println("\n--- Test transizione non valida ---");
        Segnalazione segnalazione2 = new Segnalazione(
                "S002",
                new Date(),
                "PC rotto",
                "Prof. Verdi",
                "Schermo blu",
                "B2",
                "Edificio B",
                "Tecnico Neri"
        );
        System.out.println("Stato iniziale segnalazione 2: " + segnalazione2.getStato().getNomeStato());

        try {
            System.out.println("Tentativo di chiusura diretta da APERTA...");
            segnalazione2.getStato().chiudi(segnalazione2);
        } catch (Exception e) {
            System.out.println("Eccezione catturata come previsto: " + e.getMessage());
        }
    }
}
