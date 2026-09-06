import temperatura.*;

public class Main {
        public static void main(String[] args) {
//            ConcreteSubject subject = new ConcreteSubject();
//           subject.attach(new ConcreteObserver());
//           subject.attach(new ConcreteObserver());
//
//           subject.setState(10);
//           subject.notifyObservers();

            StazioneMeteo stazioneMeteo = new StazioneMeteo();

            DisplayMeteo displayMeteo = new DisplayMeteo();
            DisplayPrezzo displayPrezzo = new DisplayPrezzo();
            stazioneMeteo.attach(displayMeteo);
            stazioneMeteo.attach(displayPrezzo);
            stazioneMeteo.setStazione(38,1024);
            StazioneServizio servizio = new StazioneServizio();
            servizio.setPrezzo(1.923F);
            servizio.attach(displayPrezzo);
            servizio.attach(displayMeteo);
            servizio.update();



        }
}
