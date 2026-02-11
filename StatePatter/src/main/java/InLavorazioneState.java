public class InLavorazioneState implements SegnalazioneState{

    public InLavorazioneState(){
        System.out.println("----CREAZIONE COSTRUTTORE IN LAVORAZIONE----");
    }

    @Override
    public void vaiInLavorazione(Segnalazione contesto) {
        throw new IllegalArgumentException("gia in lavorazione");
    }

    @Override
    public void chiudi(Segnalazione contesto) {
        contesto.setStato(new ChiudiState());

    }

    @Override
    public String getNomeStato() {
        return "IN LAVORAZIONE";
    }
}
