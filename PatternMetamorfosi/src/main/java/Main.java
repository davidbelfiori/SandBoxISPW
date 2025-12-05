// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DI GESTIONE IMPIEGATI ===\n");

        // Creazione dell'impiegato Anastasia
        Impiegato anastasia = new Impiegato("Anastasia", "Rossi");

        // Creazione di un manager generico
        Impiegato mario = new Impiegato("Mario", "Bianchi");

        // Creazione degli impieghi
        Programmatore impiegoProgrammatore = new Programmatore("Sviluppatore Senior");
        Manager impiegoManager = new Manager("Team Leader");

        // Assegnazione iniziale: Anastasia è Programmatore
        System.out.println("--- SITUAZIONE INIZIALE ---");
        anastasia.aggiungiImpiego(impiegoProgrammatore);
        anastasia.mostraImpieghi();

        // Mario è Manager
        mario.aggiungiImpiego(impiegoManager);
        mario.mostraImpieghi();

        // Anastasia svolge i suoi compiti da Programmatore
        System.out.println("\n--- ANASTASIA LAVORA COME PROGRAMMATORE ---");
        impiegoProgrammatore.svolgiCompiti();
        impiegoProgrammatore.scriviCodice();

        // PROMOZIONE: Basta cambiare l'associazione a runtime!
        System.out.println("\n--- PROMOZIONE DI ANASTASIA ---");
        Manager nuovoImpiegoManager = new Manager("Project Manager");
        anastasia.cambiaImpiego(impiegoProgrammatore, nuovoImpiegoManager);
        anastasia.mostraImpieghi();

        // Ora Anastasia svolge compiti da Manager
        System.out.println("\n--- ANASTASIA LAVORA COME MANAGER ---");
        nuovoImpiegoManager.svolgiCompiti();
        nuovoImpiegoManager.organizzaRiunione();
        nuovoImpiegoManager.assegnaCompiti();

        // Dimostrare che un impiegato può avere più impieghi contemporaneamente
        System.out.println("\n--- IMPIEGATO CON RUOLI MULTIPLI ---");
        Programmatore consulenteProg = new Programmatore("Consulente Tecnico");
        anastasia.aggiungiImpiego(consulenteProg);
        anastasia.mostraImpieghi();

        System.out.println("\n--- TUTTI GLI IMPIEGHI ---");
        anastasia.getImpieghi().forEach(imp -> {
            System.out.println("\n" + imp);
            imp.svolgiCompiti();
        });
    }
}
