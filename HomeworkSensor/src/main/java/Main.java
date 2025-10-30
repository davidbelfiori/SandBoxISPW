public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Sensor Network!");

        SensorNetwork network = new SensorNetwork();
        Gateway gateway = new Gateway("GW-001");

        SensingArea area1 = new SensingArea("Area-1");
        SensingArea area2 = new SensingArea("Area-2");

        Sensor<Double> tempSensor = new TempSensor("T-1001");
        Sensor<Double> humiditySensor = new HumiditySensor("H-2001");
        Sensor<Boolean> motionSensor = new MotionsSensor("M-3001");

        area1.addSensor(tempSensor);
        area1.addSensor(humiditySensor);
        area2.addSensor(motionSensor);

        network.addSensingArea(area1);
        network.addSensingArea(area2);

        area1.broadcastData(gateway);
        area2.broadcastData(gateway);



    }
}
