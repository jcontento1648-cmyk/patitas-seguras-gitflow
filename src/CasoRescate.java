import java.time.LocalDateTime;

public class CasoRescate {
    private final String id;
    private final LocalDateTime fecha;
    private final String ubicacion;
    private final String especie;
    private EstadoCaso estado;
    private Expediente expediente;
    private Persona encargado;

    public CasoRescate(String id, DatosReporte datos) {
        this.id = id;
        this.fecha = LocalDateTime.now();
        this.ubicacion = datos.getUbicacion();
        this.especie = datos.getEspecie();
        this.estado = EstadoCaso.RESCATADO;
    }

    // RNF-04: cada cambio de estado deja fecha y responsable
    public void cambiarEstado(EstadoCaso nuevo, Persona responsable) {
        System.out.println("[" + LocalDateTime.now() + "] Caso " + id + ": "
                + estado + " -> " + nuevo + " (por " + responsable.getNombre() + ")");
        this.estado = nuevo;
    }

    public void asignarEncargado(Persona persona) { this.encargado = persona; }
    public void setExpediente(Expediente e)        { this.expediente = e; }

    public String getId()            { return id; }
    public String getEspecie()       { return especie; }
    public String getUbicacion()     { return ubicacion; }
    public EstadoCaso getEstado()    { return estado; }
    public Expediente getExpediente(){ return expediente; }
    public Persona getEncargado()    { return encargado; }
}
