import java.util.ArrayList;
import java.util.List;

public class NotificadorRescates {
    private final List<Observador> suscriptores = new ArrayList<>();

    public void suscribir(Observador o) { suscriptores.add(o); }
    public void cancelar(Observador o)  { suscriptores.remove(o); }

    public void notificar(CasoRescate caso) {
        for (Observador o : suscriptores) {
            o.actualizar(caso);
        }
    }
}
