package epis.unsch;

import epis.unsch.adapter.AdapterPasarelaExterna;
import epis.unsch.adapter.IPasarelaPago;
import epis.unsch.factory.Comprobante;
import epis.unsch.factory.ComprobanteFactory;
import epis.unsch.strategy.CalculadoraDescuento;
import epis.unsch.strategy.DescuentoPorcentaje;
import epis.unsch.strategy.SinDescuento;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n==========================================");
            System.out.println("   SISTEMA DE VENTAS - EQUIPO 02 (06-A)   ");
            System.out.println("==========================================");
            System.out.println("1. Emitir Comprobante (Factory)");
            System.out.println("2. Calcular Descuento (Strategy)");
            System.out.println("3. Facturar en Servicio Externo (Adapter)");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1 -> ejecutarFactory(scanner);
                    case 2 -> ejecutarStrategy(scanner);
                    case 3 -> ejecutarAdapter();
                    case 0 -> System.out.println("\nSaliendo del sistema...");
                    default -> System.out.println("\nOpcion invalida. Intente de nuevo.");
                }
            } else {
                System.out.println("\nEntrada no valida. Ingrese un numero.");
                scanner.next();
            }
        }
    }

    private static void ejecutarFactory(Scanner scanner) {
        System.out.println("\n--- DEMOSTRACION PATRON FACTORY ---");
        System.out.println("1. Emitir Boleta");
        System.out.println("2. Emitir Factura");
        System.out.print("Seleccione el tipo de comprobante: ");
        int tipo = scanner.nextInt();
        String tipoStr = (tipo == 2) ? "FACTURA" : "BOLETA";
        Comprobante comprobante = ComprobanteFactory.crearComprobante(tipoStr);
        if (comprobante != null) {
            comprobante.emitir();
        }
    }

    private static void ejecutarStrategy(Scanner scanner) {
        System.out.println("\n--- DEMOSTRACION PATRON STRATEGY ---");
        System.out.print("Ingrese el monto base de la compra (S/): ");
        double montoBase = scanner.nextDouble();

        CalculadoraDescuento calculadora = new CalculadoraDescuento();

        // 1. Aplicar Sin Descuento
        calculadora.setE扶Estrategia(new SinDescuento());
        System.out.printf("Monto sin descuento: S/ %.2f%n", calculadora.calcular(montoBase));

        // 2. Aplicar Descuento del 10%
        calculadora.setEstrategia(new DescuentoPorcentaje(10));
        System.out.printf("Monto con 10%% de descuento: S/ %.2f%n", calculadora.calcular(montoBase));
    }

    private static void ejecutarAdapter() {
        System.out.println("\n--- DEMOSTRACION PATRON ADAPTER ---");
        IPasarelaPago pasarela = new AdapterPasarelaExterna();
        double totalVenta = 125.50;
        String cliente = "Juan Perez";

        System.out.println("Iniciando el cobro de la venta a nombre de: " + cliente);
        System.out.println("Monto a cobrar: S/ " + totalVenta);
        System.out.println("----------------------------------------");
        pasarela.procesarPago(cliente, totalVenta);
    }
}