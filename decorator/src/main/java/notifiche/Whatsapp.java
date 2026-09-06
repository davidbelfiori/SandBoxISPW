package notifiche;

public class Whatsapp extends NotificaDecorator {

    private String nome;
    public Whatsapp(Notifica notifica,String nome) {
        super(notifica);
        this.nome = nome;
    }

    @Override
    public void invia(String msg) {
        super.invia( msg );
        System.out.println("Invio del messaggio a "+nome + "messaggio "+ msg);
    }
}
