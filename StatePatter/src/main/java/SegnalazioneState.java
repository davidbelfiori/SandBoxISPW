public interface SegnalazioneState {
    void vaiInLavorazione(Segnalazione contesto);
    void chiudi(Segnalazione contesto);

    String getNomeStato();
}
