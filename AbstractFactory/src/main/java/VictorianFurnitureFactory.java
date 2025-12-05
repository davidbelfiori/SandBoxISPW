class VictorianFurnitureFactory extends FurnitureFactory {
    @Override
    Chair createChair() {
        return new VictorianChair();
    }
    @Override
    Sofa createSofa() {
        return new VictorianSofa();
    }
    @Override
    CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}