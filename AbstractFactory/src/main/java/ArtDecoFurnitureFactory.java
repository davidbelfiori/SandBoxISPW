class ArtDecoFurnitureFactory extends FurnitureFactory {
    @Override
    Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}
