public class DescuentoFijo implements Descuento {
    private int montoDescuento;

    public DescuentoFijo(int montoDescuento) {
        this.montoDescuento = montoDescuento;
    }

    public int aplicarDescuento(int precio) {
        return precio - montoDescuento;
    }
}