import java.util.ArrayList;
import java.util.List;

public class SensingArea {
    private final String areaId;
    private final List<Sensor<?>> sensors = new ArrayList<>();

    public SensingArea(String areaId) {
        this.areaId = areaId;
        System.out.println("SensorCluster created for area: " + areaId);
    }

    public void addSensor(Sensor<?> sensor) {
        this.sensors.add(sensor);
        System.out.println("Sensor with ID " + sensor.getId() + " added to cluster " + areaId);
    }


    public void broadcastData(Gateway gateway) {
        for (Sensor<?> sensor : sensors) {
            DataPacket<?> dataPacket = sensor.collectData();
            gateway.receiveDataPacket(dataPacket);
        }
    }
}
