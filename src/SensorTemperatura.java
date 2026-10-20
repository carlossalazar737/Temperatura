public class SensorTemperatura {
    private String idSensor;
    private double valorActual;
    private String unidad;

    public String getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(String idSensor) {
        if (idSensor != null && !idSensor.trim().isBlank()) {
            this.idSensor = idSensor;
        }
    }

    public double getValorActual() {
        return valorActual;
    }

    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        if (unidad != null && !unidad.trim().isBlank()) {
            String u = unidad.trim().toUpperCase();
            if (u.equals("C") || u.equals("F")) {
                this.unidad = u;
            }
        }
    }

    public void mostrarlectura() {
        System.out.println("Identificador del sensor: " + getIdSensor()
                + " | Lectura: " + getValorActual() + " " + getUnidad());
    }
}