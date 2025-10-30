import java.time.LocalDateTime;

public class DataPacket <T> {
   private String SensorId;
    private LocalDateTime timestamp;
    private T Payload ;

    public DataPacket(String sensorId, T payload) {
        SensorId = sensorId;
        this.timestamp = LocalDateTime.now();
        Payload = payload;
    }

  public  T getPayload() {
        return Payload;
    }

    @Override
    public String toString() {
        return "DataPacket{" +
                "SensorId=" + SensorId +
                ", timestamp=" + timestamp +
                ", Payload=" + Payload +
                '}';
    }
}
