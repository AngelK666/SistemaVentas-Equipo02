package epis.unsch;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE VENTAS - EQUIPO 02 ===");

        // El sistema de ventas usa el Adapter, pero lo trata como una IPasarelaPago
        IPasarelaPago pasarela = new AdapterPasarelaExterna();

        // Simulamos los datos de una venta
        double totalVenta = 125.50; // 125 soles con 50 centavos
        String cliente = "Juan Perez";

        System.out.println("Iniciando el cobro de la venta a nombre de: " + cliente);
        System.out.println("Monto a cobrar: S/ " + totalVenta);
        System.out.println("----------------------------------------");

        // ¡Aquí se ejecuta todo el patrón!
        pasarela.procesarPago(totalVenta, cliente);
    }
}