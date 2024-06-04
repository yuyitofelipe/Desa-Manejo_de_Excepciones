import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LibroVenta {
    private String nombreVenta;
    private String fechaVenta;

    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void guardarVenta(Cliente cliente, Vehiculo vehiculo) {
        String dir = "src/ficheros";
        File directory = new File(dir);
        if (!directory.exists()) {
            directory.mkdir();
        }

        String fileName = dir + "/" + this.nombreVenta + ".txt";
        File file = new File(fileName);

        if (!file.exists()) {
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("Patente del Vehículo: " + vehiculo.getPatente() + "\n");
                writer.write("Edad del Cliente: " + cliente.getEdad() + "\n");
                writer.write("Fecha de la Venta: " + this.fechaVenta + "\n");
                writer.write("Nombre de la Venta: " + this.nombreVenta + "\n");
                System.out.println("Venta guardada exitosamente en el archivo " + fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("El archivo " + fileName + " ya existe.");
        }
    }
}