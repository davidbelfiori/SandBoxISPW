public class ConcreteObserver implements Osservatore {

    @Override
    public void update(int newState) {
        System.out.println("Osservatore notified with new state: " + newState);
    }
}
