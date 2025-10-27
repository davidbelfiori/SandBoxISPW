public abstract class Sensor {
    Integer id;
    Integer samplingFrequency = 60; // default value in seconds
    Boolean isMute;
    private static int numberOfInstances;
    private NetworkAdapter networkAdapter;

    public Sensor(Integer id, Integer samplingFrequency, Boolean isMute) {
        this.id = id;
        this.samplingFrequency = samplingFrequency;
        this.isMute = isMute;
        numberOfInstances++;
        this.networkAdapter = new NetworkAdapter();
    }
    public abstract int getMeasure();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSamplingFrequency() {
        return samplingFrequency;
    }

    public void setSamplingFrequency(Integer samplingFrequency) {
        this.samplingFrequency = samplingFrequency;
    }

    public Boolean getMute() {
        return isMute;
    }

    public void setMute(Boolean mute) {
        isMute = mute;
    }

    public static int getNumberOfInstances() {
        return numberOfInstances;
    }

}
