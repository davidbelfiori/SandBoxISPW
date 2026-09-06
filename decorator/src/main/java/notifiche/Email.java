package notifiche;

public class Email implements Notifica{

    private String email;

    public  Email (String email){
        this.email = email;
    }

    @Override
    public void invia(String msg) {
        System.out.println( "Messaggio alla mail"+email +":" + msg );
    }
}
