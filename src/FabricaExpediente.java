public abstract class FabricaExpediente {
    protected abstract Expediente crearExpediente();

    public Expediente abrirExpediente(CasoRescate caso) {
        Expediente e = crearExpediente();
        e.asociar(caso);
        return e;
    }
}
