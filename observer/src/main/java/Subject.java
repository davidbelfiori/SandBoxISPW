import java.util.Observer;

public interface Subject {
    void attach(Osservatore observer);
    void detach(Osservatore observer);
    void notifyObservers();
}
