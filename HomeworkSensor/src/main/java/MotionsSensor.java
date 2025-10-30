public class MotionsSensor implements Sensor<Boolean> {
    private final String id;

    public MotionsSensor(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public DataPacket<Boolean> collectData() {
        boolean motionDetected = Math.random() < 0.5; // Simulated motion detection
        return new DataPacket<>(this.id, motionDetected);
    }
}
