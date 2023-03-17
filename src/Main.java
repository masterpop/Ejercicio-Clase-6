public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto jabonEnPolvo = new Producto(1, "jabón en polvo");
        Producto esponjas = new Producto(0, "esponjas");
        Producto chocolates = new Producto(0, "chocolates");

        // Crear carrito y agregar productos
        Carrito carrito = new Carrito();
        carrito.agregarProducto(jabonEnPolvo);
        carrito.agregarProducto(esponjas);
        carrito.agregarProducto(chocolates);

        // Calcular precio sin descuento
        System.out.println("Precio sin descuento: " + carrito.precio());

        // Aplicar descuento fijo
        carrito.setDescuento(new DescuentoFijo(20));
        System.out.println("Precio con descuento fijo: " + carrito.precio());

        // Aplicar descuento porcentaje
        carrito.setDescuento(new DescuentoPorcentaje(0.2));
        System.out.println("Precio con descuento porcentaje: " + carrito.precio());

        // Aplicar descuento porcentaje con tope
        carrito.setDescuento(new DescuentoPorcentajeConTope(0.5, 20));
        System.out.println("Precio con descuento porcentaje con tope: " + carrito.precio());
    }
}