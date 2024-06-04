public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("12345678-9", "Juan Perez", 21, 21);
        Vehiculo vehiculo = new Vehiculo("Rojo", "AB1234");
        LibroVenta libroVenta = new LibroVenta("Venta3", "01102020");
        libroVenta.guardarVenta(cliente, vehiculo);
    }
}
