public class Cliente extends Persona {
    private int edad;

    public Cliente(String rut, String nombre, int edad, int edadCliente) {
        super(rut, nombre, edad);
        this.edad = edadCliente;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
}