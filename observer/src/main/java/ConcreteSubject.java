import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class ConcreteSubject implements Subject{

    List<Osservatore> observers = new ArrayList<>();
    private int state;

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void attach(Osservatore observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Osservatore observer) {
        observers.remove(observer);
    }



    @Override
    public void notifyObservers() {
        for (Osservatore observer : observers) {
            observer.update(state);
        }
    }

}

