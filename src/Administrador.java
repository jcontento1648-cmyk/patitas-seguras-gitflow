public class Administrador extends Persona {
    public Administrador(String nombre, String contacto) { super(nombre, contacto); }

    public void aprobarAdopcion(CasoRescate caso) {
        caso.cambiarEstado(EstadoCaso.ADOPTADO, this);
    }
}
