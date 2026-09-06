public class Client {
    public static void main(String[] args){
        Factory factory = new Factory();
        ConcreteProduct p1 = factory.createA();
        ConcreteProduct p2 = factory.createB();
        ConcreteProduct p3 = factory.createC();
        p1.useProcudct();
        p2.useProcudct();
        p3.useProcudct();
    }
}
