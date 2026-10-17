public class FabricaFaunaSilvestre extends FabricaExpediente {
    @Override
    protected Expediente crearExpediente() {
        return new ExpedienteFaunaSilvestre();
    }
}
