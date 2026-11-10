package epis.unsch.strategy;

public class SinDescuento implements EstrategiaDescuento {
    @Override
    public double aplicarDescuento(double montoTotal) {
        return montoTotal;
    }
}