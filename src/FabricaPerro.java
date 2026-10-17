public class FabricaPerro extends FabricaExpediente {
    @Override
    protected Expediente crearExpediente() {
        return new ExpedientePerro();
    }
}
