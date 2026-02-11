import java.util.Date;

public class Segnalazione {

    private String idSegnalazione;
    private Date dataCreazione;
    private String oggettoGuasto;
    private String docente;
    private SegnalazioneState stato;
    private String descrizione;
    private String aula;
    private String edificio;
    private String tecnico;

    public Segnalazione(String idSegnalazione, Date dataCreazione, String oggettoGuasto, String docente, String descrizione, String aula, String edificio, String tecnico) {
        this.idSegnalazione = idSegnalazione;
        this.dataCreazione = dataCreazione;
        this.oggettoGuasto = oggettoGuasto;
        this.docente = docente;
        this.stato = new ApertaState();
        this.descrizione = descrizione;
        this.aula = aula;
        this.edificio = edificio;
        this.tecnico = tecnico;
    }

    public String getIdSegnalazione() {
        return idSegnalazione;
    }

    public void setIdSegnalazione(String idSegnalazione) {
        this.idSegnalazione = idSegnalazione;
    }

    public Date getDataCreazione() {
        return dataCreazione;
    }

    public void setDataCreazione(Date dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    public String getOggettoGuasto() {
        return oggettoGuasto;
    }

    public void setOggettoGuasto(String oggettoGuasto) {
        this.oggettoGuasto = oggettoGuasto;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public SegnalazioneState getStato() {
        return stato;
    }

    public void setStato(SegnalazioneState stato) {
        this.stato = stato;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }
}
