public class CasoController {
    private final GestorCasos modelo = GestorCasos.getInstancia();
    private final CasoView vista;

    public CasoController(CasoView vista) {
        this.vista = vista;
    }

    public void reportarRescate(DatosReporte datos) {
        CasoRescate caso = modelo.crearCaso(datos);
        FabricaExpediente fabrica = seleccionarFabrica(datos.getEspecie());
        caso.setExpediente(fabrica.abrirExpediente(caso));
        vista.mostrarConfirmacion(caso.getId());
    }

    public void consultarCasos() {
        vista.mostrarCasos(modelo.consultar());
    }

    private FabricaExpediente seleccionarFabrica(String especie) {
        switch (especie.toLowerCase()) {
            case "perro": return new FabricaPerro();
            case "gato":  return new FabricaGato();
            default:      return new FabricaFaunaSilvestre();
        }
    }
}
