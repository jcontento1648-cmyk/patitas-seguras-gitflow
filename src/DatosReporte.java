public class DatosReporte {
    private final String ubicacion;
    private final String especie;      // "perro", "gato" o "fauna"
    private final String descripcion;
    private final String fotografia;

    public DatosReporte(String ubicacion, String especie, String descripcion, String fotografia) {
        this.ubicacion = ubicacion;
        this.especie = especie;
        this.descripcion = descripcion;
        this.fotografia = fotografia;
    }

    public String getUbicacion()   { return ubicacion; }
    public String getEspecie()     { return especie; }
    public String getDescripcion() { return descripcion; }
    public String getFotografia()  { return fotografia; }
}
