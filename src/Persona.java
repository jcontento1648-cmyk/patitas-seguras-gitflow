public abstract class Persona {
    protected final String nombre;
    protected final String contacto;

    protected Persona(String nombre, String contacto) {
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public String getNombre() { return nombre; }
}
