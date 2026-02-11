public class ApertaState implements SegnalazioneState{

    public ApertaState(){
        System.out.println("----CREAZIONE COSTRUTTORE APERTA----");
    }

    @Override
    public void vaiInLavorazione(Segnalazione contesto) {
        contesto.setStato(new InLavorazioneState());

    }

    @Override
    public void chiudi(Segnalazione contesto) {
        throw new IllegalArgumentException("Non è possibile chiudere");
    }

    @Override
    public String getNomeStato() {
        return "APERTA";
    }
}
