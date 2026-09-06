public class StatoSegnalazioneAperta implements StatoSegnalazione{
    @Override
    public void inLavorazione(Segnalazione s) {
        System.out.println("Transizione da aperta a in lavorazione");
        s.setStato(new StatoSegnalazioneInLavorazione());
    }

    @Override
    public void chiudi(Segnalazione s) {
        System.out.println("Non puoi chiudere una segnalazione aperta");
    }


}
