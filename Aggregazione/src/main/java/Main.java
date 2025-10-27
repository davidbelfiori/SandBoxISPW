public class Main {
    public static void main(String[] args) {
        Corso matematica = new Corso("Matematica");
        Corso fisica = new Corso("Fisica");
        Studente studente = new Studente("Luca");
        studente.aggiungiCorso(matematica);
        studente.aggiungiCorso(fisica);
        studente.stampaCorsi();
    }
}
