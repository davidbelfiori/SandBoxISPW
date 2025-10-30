import java.util.ArrayList;
import java.util.List;

public class SensorNetwork {
    private final List<SensingArea> sensingAreas = new ArrayList<>();

    public void addSensingArea(SensingArea area) {
        this.sensingAreas.add(area);
        System.out.println("Sensing area with ID " + area + " added to the network.");
    }
}
