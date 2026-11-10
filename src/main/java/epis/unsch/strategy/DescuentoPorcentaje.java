package epis.unsch.strategy;

public class DescuentoPorcentaje implements EstrategiaDescuento {
    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(double montoTotal) {
        return montoTotal - (montoTotal * (porcentaje / 100.0));
    }
}