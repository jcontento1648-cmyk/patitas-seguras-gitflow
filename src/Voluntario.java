public class Voluntario extends Persona implements Observador {
    public Voluntario(String nombre, String contacto) { super(nombre, contacto); }

    @Override
    public void actualizar(CasoRescate caso) {
        System.out.println("[Aviso a " + nombre + "] Nuevo rescate " + caso.getId()
                + " (" + caso.getEspecie() + ") en " + caso.getUbicacion());
    }

    public void aceptarCaso(CasoRescate caso) {
        caso.asignarEncargado(this);
        System.out.println(nombre + " aceptó el caso " + caso.getId());
    }
}
