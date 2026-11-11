package epis.unsch;

// ADAPTER: Actúa como puente entre el sistema y la API externa.
// Nota que implementa la interfaz Target.
public class AdapterPasarelaExterna implements IPasarelaPago {

    // Instanciamos el servicio externo que queremos adaptar
    private PasarelaExternaAPI apiExterna;

    public AdapterPasarelaExterna() {
        // Inicializamos el servicio externo
        this.apiExterna = new PasarelaExternaAPI();
    }

    @Override
    public void procesarPago(double monto, String nombreCliente) {
        // 1. TRADUCCIÓN DE DATOS: De Soles (double) a Centavos (int)
        int montoEnCentavos = (int) (monto * 100);

        // 2. TRADUCCIÓN DE DATOS: Generamos un ID de transacción falso
        // (Le quitamos los espacios al nombre y lo pasamos a mayúsculas)
        String idTransaccion = "TX-" + nombreCliente.replace(" ", "").toUpperCase();

        System.out.println("Adapter: Traduciendo datos para la API Externa...");

        // 3. Llamamos al método incompatible del servicio externo
        apiExterna.hacerCobroExterno(montoEnCentavos, idTransaccion);
    }
}