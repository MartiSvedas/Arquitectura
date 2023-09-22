package repositories;

import Interface.EstudianteCarreraRepository;
import entities.Carrera;
import entities.Estudiante;
import entities.EstudianteCarrera;

import javax.persistence.EntityManager;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class EstudianteCarreraRepositoryImp implements EstudianteCarreraRepository {
    private EntityManager em;

    public EstudianteCarreraRepositoryImp(EntityManager em) {
        this.em = em;
    }


    @Override
    public void matricularEstudiante(EstudianteCarrera ec) {
        this.em.getTransaction().begin();
            em.persist(ec);
            this.em.getTransaction().commit();
    }


}
