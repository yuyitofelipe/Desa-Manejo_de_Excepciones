public class Taxi extends Vehiculo {
    private int valorPasaje;

    public Taxi(String color, String patente, int valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public int pagarPasaje(int pasaje) {
        int vuelto = 0;
        if (pasaje >= getValorPasaje()) {
            vuelto = pasaje - getValorPasaje();
        } else {
            vuelto = pasaje;
        }
        return vuelto;
    }
}