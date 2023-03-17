public class Carrito {
    private Producto[] productos = new Producto[3];
    private int cantidadProductos = 0;
    private Descuento descuento;

    public void agregarProducto(Producto producto) {
        if (cantidadProductos < 3) {
            productos[cantidadProductos] = producto;
            cantidadProductos++;
        }
    }

    public int precio() {
        int total = 0;
        for (int i = 0; i < cantidadProductos; i++) {
            total += productos[i].getPrecio();
        }
        if (descuento != null) {
            return descuento.aplicarDescuento(total);
        } else {
            return total;
        }
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }
}