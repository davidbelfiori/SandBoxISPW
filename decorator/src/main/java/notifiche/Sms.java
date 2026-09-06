package notifiche;

public class Sms extends NotificaDecorator{

    private String numero;
    public Sms(Notifica notifica, String numero) {
        super(notifica);
        this.numero = numero;
    }

    @Override
    public void invia(String msg) {
        super.invia(msg);
        System.out.println( "Messaggio  sms a "+ numero + "messaggio" +msg);
    }
}
