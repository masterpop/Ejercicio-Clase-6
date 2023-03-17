
public class DescuentoPorcentajeConTope implements Descuento {
    private double porcentajeDescuento;
    private int tope;

    public DescuentoPorcentajeConTope(double porcentajeDescuento, int tope) {
        this.porcentajeDescuento = porcentajeDescuento;
        this.tope = tope;
    }

    public int aplicarDescuento(int precio) {
        int descuento = (int) Math.round(precio * porcentajeDescuento);
        if (descuento > tope) {
            return precio - tope;
        } else {
            return precio - descuento;
        }
    }
}