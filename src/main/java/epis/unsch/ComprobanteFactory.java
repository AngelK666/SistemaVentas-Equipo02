package epis.unsch;

public class ComprobanteFactory {
    public static Comprobante crearComprobante(String tipo, String documentoCliente) {
        if (tipo == null) return null;
        switch (tipo.toLowerCase()) {
            case "boleta":
                return new Boleta(documentoCliente);
            case "factura":
                return new Factura(documentoCliente);
            default:
                throw new IllegalArgumentException("Tipo de comprobante no válido: " + tipo);
        }
    }
}
