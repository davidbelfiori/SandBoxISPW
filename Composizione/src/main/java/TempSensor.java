public class TempSensor extends Sensor {
  private int Temperature = 0;

    public TempSensor(Integer id, Integer samplingFrequency, Boolean isMute) {
        super(id, samplingFrequency, isMute);
    }

    @Override
    public int getMeasure() {
        return 0;
    }
}
