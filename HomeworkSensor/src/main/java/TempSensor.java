import java.time.LocalDateTime;

public class TempSensor implements Sensor<Double>{
    private final String  id;

    public TempSensor(String id) {
        this.id = id;
    }


    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public DataPacket<Double> collectData() {
        double temperature = 15 + Math.random() * 10;// Simulated temperature between 15 and 25
        LocalDateTime timestamp = LocalDateTime.now();
        return new DataPacket<>(this.id,temperature);
    }
}
