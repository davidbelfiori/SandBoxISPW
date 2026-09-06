public class client {


    public static void main(String[] args){
        Segnalazione segnalazione = new Segnalazione("Segnalazione 1","Tavolo rotto");


        segnalazione.inLavorazione();
        segnalazione.chiudi();
        segnalazione.inLavorazione();

    }

}
