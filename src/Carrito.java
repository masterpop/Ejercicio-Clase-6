import java.util.ArrayList;
import java.util.List;

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
        if (total == 0) {
            throw new IllegalArgumentException("El precio total del carrito es cero");
        }
        if (descuento != null) {
            int precioConDescuento = descuento.aplicarDescuento(total);
            if (precioConDescuento < 0) {
                throw new IllegalStateException("El descuento produce un resultado negativo");
            }
            return precioConDescuento;
        } else {
            return total;
        }
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }
}
