
    public class Main {
        public static void main(String[] args) {
            // Crear productos
            Producto jabonEnPolvo = new Producto(0, "jabón en polvo");
            Producto esponjas = new Producto(2, "esponjas");
            Producto chocolates = new Producto(0, "chocolates");

            // Crear carrito y agregar productos
            Carrito carrito = new Carrito();
            carrito.agregarProducto(jabonEnPolvo);
            carrito.agregarProducto(esponjas);
            carrito.agregarProducto(chocolates);

            try {
                // Calcular precio sin descuento
                System.out.println("Precio sin descuento: " + carrito.precio());

                // Calcular precio con descuento fijo
                carrito.setDescuento(new DescuentoFijo(20));
                System.out.println("Precio con descuento fijo: " + carrito.precio());

                // Aplicar descuento porcentaje
                carrito.setDescuento(new DescuentoPorcentaje(0.1));
                System.out.println("Precio con descuento porcentaje: " + carrito.precio());

                // Aplicar descuento porcentaje con tope
                carrito.setDescuento(new DescuentoPorcentajeConTope(0.1, 30));
                System.out.println("Precio con descuento porcentaje con tope: " + carrito.precio());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }