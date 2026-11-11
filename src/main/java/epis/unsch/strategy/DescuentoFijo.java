package epis.unsch.strategy;

public class DescuentoFijo implements EstrategiaDescuento {
    private double montoFijo;

    public DescuentoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double aplicarDescuento(double montoTotal) {
        // Garantiza que el monto no sea negativo tras el descuento
        return Math.max(0, montoTotal - montoFijo);
    }
}