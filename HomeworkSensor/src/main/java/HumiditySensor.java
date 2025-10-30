public class HumiditySensor implements Sensor<Double> {
    private final String id;

    public HumiditySensor(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public DataPacket<Double> collectData() {
        double humidity = 30 + Math.random() * 50; // Simulated humidity between 30% and 80%
        return new DataPacket<>(this.id, humidity);
    }
}
