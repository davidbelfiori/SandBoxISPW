package temperatura;

import java.util.ArrayList;
import java.util.List;

public class StazioneMeteo implements Subject2{

    List<Observer2> observers = new ArrayList<>();
    private float temperatura ;
    private float pressione;


    public void setStazione (float temperatura, float pressione){
        this.temperatura = temperatura;
        this.pressione = pressione;
        update();
    }

    public float getPressione() {
        return pressione;
    }

    public float getTemperatura() {
        return temperatura;
    }

    @Override
    public void attach(Observer2 o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer2 o) {
        observers.remove(o);
    }

    @Override
    public String toString() {
        return "StazioneMeteo{" +
                "temperatura=" + temperatura +
                ", pressione=" + pressione +
                '}';
    }

    @Override
    public void update() {
        for(Observer2 o : observers){
            o.update(this);
        }
    }
}
