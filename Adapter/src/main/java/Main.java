public class Main {

    public  static void main ( String[] args ) {
        Adaptee a = new Adaptee();
        Target a1 = new Adapter(a);

        System.out.println("Tassa da pagare: "+a1.request("12345",12356));

    }
}
