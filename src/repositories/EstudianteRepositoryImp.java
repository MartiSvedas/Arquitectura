package repositories;

import Interface.EstudianteRepository;
import entities.Estudiante;

import javax.persistence.EntityManager;
import java.util.List;

public class EstudianteRepositoryImp implements EstudianteRepository {
    private EntityManager em;

    public EstudianteRepositoryImp(EntityManager em) {
        this.em = em;
    }

    @Override
    public void altaEstudiante(Estudiante e) {
        //ver chequeos de si ya existe
        this.em.getTransaction().begin();
        if(!em.contains(e)) {
            em.persist(e);
        } else {
            em.merge(e);
        }
        this.em.getTransaction().commit();

    }


    @Override
    public List<Estudiante> listaEstudiantePorApellido() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Estudiante estudiantePorLibreta(int numeroLibreta) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Estudiante> listaEstudiantePorGenero(String genero) {
        // TODO Auto-generated method stub
        return null;
    }



}