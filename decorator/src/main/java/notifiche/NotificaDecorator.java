package notifiche;

public abstract class NotificaDecorator implements Notifica {

    private Notifica notifica;

    public NotificaDecorator(Notifica notifica) {
        this.notifica = notifica;
    }

    @Override
    public void invia(String msg) {
        notifica.invia( msg );
    }
}
