package Interface;

import entities.Carrera;
import entities.Estudiante;

import java.util.List;

public interface CarreraRepository {
    void insertarCarrera(Carrera c);
    List<Carrera> cantidadInscriptosCarrera();
    List<Estudiante> estudiantesPorCarrera(Carrera carrera, String ciudad);
    void matricularEstudiante(Estudiante e);
}
