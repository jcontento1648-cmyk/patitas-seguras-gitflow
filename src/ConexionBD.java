public class ConexionBD {
    private static ConexionBD instancia;

    private ConexionBD() { }

    public static synchronized ConexionBD getInstancia() {
        if (instancia == null) {
            instancia = new ConexionBD();
        }
        return instancia;
    }

    public void guardar(CasoRescate caso) {
        System.out.println("[BD] Caso " + caso.getId() + " guardado.");
    }
}
