public class StatoSegnalazioneInLavorazione implements StatoSegnalazione{
    @Override
    public void inLavorazione(Segnalazione s) {
        System.out.println("Segnalazione in lavorazione");
    }

    @Override
    public void chiudi(Segnalazione s) {
        System.out.println("Transizione da in lavorazione a chiusa");
        s.setStato(new StatoSegnalazioneChiusa());
    }
}
