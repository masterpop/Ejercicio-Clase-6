public class Producto {
    private int precioUnitario;
    private String nombre;

    public Producto(int precioUnitario, String nombre) {
        this.precioUnitario = precioUnitario;
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precioUnitario;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // getters y setters
}

