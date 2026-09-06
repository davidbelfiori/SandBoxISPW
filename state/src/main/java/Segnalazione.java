public class Segnalazione {

    private String id;
    private String oggetto;
    private StatoSegnalazione stato;


    public Segnalazione(String id, String oggetto) {
        this.id = id;
        this.oggetto = oggetto;
        this.stato = new StatoSegnalazioneAperta();
    }

    public StatoSegnalazione getStato() {
        return stato;
    }

  public void inLavorazione() {
        this.stato.inLavorazione(this);
    }

    public void chiudi() {
        this.stato.chiudi(this);
    }


    public void setStato(StatoSegnalazione stato) {
        this.stato = stato;
    }

    public String getOggetto() {
        return oggetto;
    }

    public void setOggetto(String oggetto) {
        this.oggetto = oggetto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
