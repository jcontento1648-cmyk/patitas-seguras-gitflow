# PatitasSeguras – Sistema de Control de Rescate y Adopción Animal

Sistema para gestionar los casos de un refugio animal: reporte de rescate, asignación de encargado,
control de estados (Rescatado → En Tratamiento → En Adopción → Adoptado) y adopción.

Proyecto de la Actividad 1 – Desarrollo de Sistemas Informáticos (Unidad 1).

## Patrones de diseño aplicados
| Patrón | Clases | Rama feature |
|---|---|---|
| Singleton | `GestorCasos`, `ConexionBD` | `feature/gestor-singleton` |
| Factory Method | `FabricaExpediente` y fábricas por especie | `feature/expedientes-factory` |
| Observer | `NotificadorRescates`, `Observador`, `Voluntario` | `feature/notificaciones-observer` |
| MVC | `CasoController`, `CasoView`, `GestorCasos` | `feature/interfaz-mvc` |

## Estructura de ramas (Gitflow)
- `master`: versiones estables (etiquetadas, p. ej. `v1.0.0`).
- `develop`: integración de funcionalidades.
- `feature/*`: una rama por funcionalidad, creada desde `develop` y fusionada mediante pull request.

## Ejecutar
```bash
mkdir out
javac -d out src/*.java
java -cp out Main
```

## Documentación
Diagramas UML (casos de uso, clases, secuencia y arquitectura) en `docs/diagramas/`.
