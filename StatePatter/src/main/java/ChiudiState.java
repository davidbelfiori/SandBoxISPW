public class ChiudiState implements SegnalazioneState{

    public ChiudiState(){
        System.out.println("----CREAZIONE COSTRUTTORE CHIUSA----");
    }

    @Override
    public void vaiInLavorazione(Segnalazione contesto) {
        throw new IllegalStateException("La segnalazione è chiusa e non può essere riaperta.");
    }

    @Override
    public void chiudi(Segnalazione contesto) {
        throw new IllegalStateException("La segnalazione è già chiusa.");
    }

    @Override
    public String getNomeStato() {
        return "CHIUSA";
    }
}
