package temperatura;

import java.util.Observable;
import java.util.Observer;

public class DisplayMeteo implements Observer2 {

    @Override
    public void update(Subject2 subject) {
        if(subject instanceof StazioneMeteo){
            System.out.println(subject.toString());
        }else {
            System.out.println("Non me serve so meteo");
        }
    }
}
