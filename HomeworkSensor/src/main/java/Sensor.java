public interface Sensor<T> {
    String  getId();
    DataPacket<T> collectData();

}
