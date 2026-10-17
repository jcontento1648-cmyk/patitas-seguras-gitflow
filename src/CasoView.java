import java.util.List;

public class CasoView {
    public void mostrarConfirmacion(String idCaso) {
        System.out.println(">> Reporte recibido. Número de caso: " + idCaso);
    }

    public void mostrarCasos(List<CasoRescate> casos) {
        for (CasoRescate c : casos) {
            System.out.println(c.getId() + " | " + c.getEspecie() + " | " + c.getEstado()
                    + " | " + c.getExpediente().resumen());
        }
    }
}
