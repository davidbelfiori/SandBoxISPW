import java.util.ArrayList;
import java.util.List;

public class Gateway {
    private final String id;
    private final List<DataPacket<?>> receivedData = new ArrayList<>();

    public Gateway(String id) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }

    public void receiveDataPacket(DataPacket<?> packet) {
        System.out.println("Gateway " + id + "recived data" + packet);
        receivedData.add(packet);

    }
}
