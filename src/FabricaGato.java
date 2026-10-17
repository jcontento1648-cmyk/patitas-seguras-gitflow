public class FabricaGato extends FabricaExpediente {
    @Override
    protected Expediente crearExpediente() {
        return new ExpedienteGato();
    }
}
