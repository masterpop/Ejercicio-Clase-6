public class DescuentoPorcentaje implements Descuento {
    private double porcentajeDescuento;

    public DescuentoPorcentaje(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public int aplicarDescuento(int precio) {
        return (int) Math.round(precio * (1 - porcentajeDescuento));
    }
}