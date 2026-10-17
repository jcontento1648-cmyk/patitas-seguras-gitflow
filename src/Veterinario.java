public class Veterinario extends Persona {
    public Veterinario(String nombre, String contacto) { super(nombre, contacto); }

    public void registrarDiagnostico(CasoRescate caso, String diagnostico) {
        caso.getExpediente().registrarAtencion(diagnostico);
    }
}
