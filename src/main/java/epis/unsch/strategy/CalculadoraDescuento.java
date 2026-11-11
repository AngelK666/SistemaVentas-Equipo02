package epis.unsch.strategy;

public class CalculadoraDescuento {
    private EstrategiaDescuento estrategia;

    public void setEstrategia(EstrategiaDescuento estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(double monto) {
        if (estrategia == null) {
            return monto;
        }
        return estrategia.aplicarDescuento(monto);
    }
}