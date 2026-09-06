package temperatura;

import java.util.ArrayList;
import java.util.List;

public class StazioneServizio implements Subject2{

    private  float prezzo;
    List<Observer2> observers = new ArrayList<>();

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
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
    public void update() {
        for (Observer2 o : observers) {
            o.update(this);
        }
    }
}
