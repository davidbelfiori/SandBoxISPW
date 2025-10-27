import java.util.ArrayList;

class Studente {
    private String nome;
    private ArrayList<Corso> corsi;

    public Studente(String nome) {
        this.nome = nome;
        this.corsi = new ArrayList<>();
    }

    public void aggiungiCorso(Corso corso) {
        corsi.add(corso);
    }

    public void stampaCorsi() {
        System.out.println("Corsi di " + nome + ":");
        for (Corso c : corsi) {
            System.out.println("- " + c.getNome());
        }
    }
}