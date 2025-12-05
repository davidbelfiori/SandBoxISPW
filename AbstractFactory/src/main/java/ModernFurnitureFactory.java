class ModernFurnitureFactory extends FurnitureFactory {
    @Override
    Chair createChair() {
        return new ModernChair();
    }
    @Override
    Sofa createSofa() {
        return new ModernSofa();
    }
    @Override
    CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}