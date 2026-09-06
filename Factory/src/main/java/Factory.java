public class Factory {
    public ConcreteProduct createA(){
        return new ConcreteProductA();
    }

    public ConcreteProduct createB(){
        return new ConcreteProductB();
    }
    public ConcreteProduct createC(){
        return new ConcreteProductC();
    }
}
