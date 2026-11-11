package epis.unsch;

// ADAPTEE: El servicio externo simulado. Tiene una firma incompatible.
public class PasarelaExternaAPI {

    // Fíjate que recibe centavos (int) y un ID (String), no un double ni el nombre
    public void hacerCobroExterno(int montoEnCentavos, String idTransaccion) {
        System.out.println("[API EXTERNA] Procesando cobro por " + montoEnCentavos + " centavos.");
        System.out.println("[API EXTERNA] Transacción ID: " + idTransaccion);
        System.out.println("[API EXTERNA] ¡Cobro exitoso!");
    }
}