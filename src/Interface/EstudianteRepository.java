package Interface;

import entities.Estudiante;

import java.util.List;

public interface EstudianteRepository {
    void altaEstudiante(Estudiante e);

    List<Estudiante> listaEstudiantePorApellido();

    Estudiante estudiantePorLibreta(int numeroLibreta);

    List<Estudiante> listaEstudiantePorGenero(String genero);












}