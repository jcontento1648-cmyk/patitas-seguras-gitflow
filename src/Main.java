public class Main {
    public static void main(String[] args) {
        CasoView vista = new CasoView();
        CasoController controlador = new CasoController(vista);

        Voluntario ana = new Voluntario("Ana", "ana@refugio.org");
        Voluntario luis = new Voluntario("Luis", "luis@refugio.org");
        GestorCasos.getInstancia().getNotificador().suscribir(ana);
        GestorCasos.getInstancia().getNotificador().suscribir(luis);

        controlador.reportarRescate(new DatosReporte("Av. Principal y 9 de Octubre", "perro", "Cachorro herido", "foto1.jpg"));
        controlador.reportarRescate(new DatosReporte("Parque Samanes", "gato", "Gato adulto", "foto2.jpg"));

        CasoRescate primero = GestorCasos.getInstancia().consultar().get(0);
        ana.aceptarCaso(primero);
        primero.cambiarEstado(EstadoCaso.EN_TRATAMIENTO, new Veterinario("Dr. Mora", "vet@refugio.org"));

        controlador.consultarCasos();
    }
}
