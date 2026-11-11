package epis.unsch;

public class ComprobanteFactory {
    public static Comprobante crearComprobante(String tipo, String cliente) {
        if (tipo == null) return null;

        switch (tipo.toUpperCase()) {
            case "BOLETA":
                return new Boleta(cliente);
            case "FACTURA":
                return new Factura(cliente);
            case "TICKET": // Reto de Evolución
                return new Ticket(cliente);
            default:
                return null;
        }
    }
}