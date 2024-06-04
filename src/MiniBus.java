public class MiniBus extends Bus {
    private String tipoViaje;

    public MiniBus(String color, String patente, int cantidadDeAsientos, String tipoViaje) {
        super(color, patente, cantidadDeAsientos);
        this.tipoViaje = tipoViaje;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public void imprimeBus() {
        System.out.println("Color: " + super.getColor());
        System.out.println("Patente: " + super.getPatente());
        System.out.println("Cantidad de Asientos: " + super.getCantidadDeAsientos());
        System.out.println("Tipo de Viaje: " + getTipoViaje());
    }
}