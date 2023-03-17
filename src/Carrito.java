import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos = new ArrayList<>();
    private Descuento descuento;

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public int precio() {
        int total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        if (total == 0) {
            throw new RuntimeException("No se puede aplicar un descuento a un carrito de precio 0");
        }
        if (descuento != null) {
            int precioConDescuento = descuento.aplicarDescuento(total);
            if (precioConDescuento < 0) {
                throw new RuntimeException("El descuento resulta en un monto negativo");
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


















/* public class Carrito {
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

*/