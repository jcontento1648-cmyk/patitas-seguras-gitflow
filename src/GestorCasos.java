import java.util.ArrayList;
import java.util.List;

public class GestorCasos {
    private static GestorCasos instancia;
    private final List<CasoRescate> casos = new ArrayList<>();
    private final ConexionBD bd = ConexionBD.getInstancia();
    private final NotificadorRescates notificador = new NotificadorRescates();
    private int contador = 0;

    private GestorCasos() { }

    public static synchronized GestorCasos getInstancia() {
        if (instancia == null) {
            instancia = new GestorCasos();
        }
        return instancia;
    }

    public CasoRescate crearCaso(DatosReporte datos) {
        CasoRescate caso = new CasoRescate("CR-" + (++contador), datos);
        registrar(caso);
        notificador.notificar(caso);   // RF-05
        return caso;
    }

    public void registrar(CasoRescate caso) {
        casos.add(caso);
        bd.guardar(caso);
    }

    public NotificadorRescates getNotificador() { return notificador; }
    public List<CasoRescate> consultar() { return casos; }
}
