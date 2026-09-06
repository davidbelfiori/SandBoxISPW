public class StatoSegnalazioneChiusa implements StatoSegnalazione{

    @Override
    public void inLavorazione(Segnalazione s) {
        System.out.println("operazione non consentita, la segnalazione è già chiusa");
    }

    @Override
    public void chiudi(Segnalazione s) {
        System.out.println("Segnalazione già chiusa");
    }
}
