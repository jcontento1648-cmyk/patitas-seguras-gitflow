import java.util.ArrayList;
import java.util.List;

public abstract class Expediente {
    protected final List<String> atenciones = new ArrayList<>();
    protected CasoRescate caso;

    public void asociar(CasoRescate caso) { this.caso = caso; }

    public void registrarAtencion(String detalle) { atenciones.add(detalle); }

    public List<String> getAtenciones() { return atenciones; }

    public abstract String resumen();
}
