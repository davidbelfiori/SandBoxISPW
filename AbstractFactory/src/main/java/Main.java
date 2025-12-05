public class Main {
    public static void main(String[] args) {
// Scelgo la famiglia di mobili "Modern"
        FurnitureFactory factory = new ModernFurnitureFactory();
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeeTable table = factory.createCoffeeTable();
        chair.sitOn(); // Output: Siedo su una sedia moderna.
        sofa.relaxOn(); // Output: Mi rilasso su un divano moderno.
        table.putCoffeeOn(); // Output: Appoggio il caffè su un tavolin moderno.

        System.out.println("\n--- Cambio stile: Victorian ---");
        factory = new VictorianFurnitureFactory();
        chair = factory.createChair();
        sofa = factory.createSofa();
        table = factory.createCoffeeTable();
        chair.sitOn(); // Output: Siedo su una sedia vittoriana.
        sofa.relaxOn(); // Output: Mi rilasso su un divano vittoriano.
                table.putCoffeeOn(); // Output: Appoggio il caffè su un tavolino vittoriano.
    }
}