public class MainSensorTemperatura {
    public static void main(String[] args) {
        SensorTemperatura S1 = new SensorTemperatura();
        SensorTemperatura S2 = new SensorTemperatura();
        SensorTemperatura S3 = new SensorTemperatura();

        S1.setIdSensor("SENS-001");
        S1.setValorActual(23.5);
        S1.setUnidad("c");

        S2.setIdSensor("SENS-002");
        S2.setValorActual(74.3);
        S2.setUnidad("F");

        S3.setIdSensor("SENS-003");
        S3.setValorActual(18);
        S3.setUnidad("K");

        S1.mostrarlectura();
        S2.mostrarlectura();
        S3.mostrarlectura();

        S3.setUnidad("c");
        S3.mostrarlectura();
    }
}
