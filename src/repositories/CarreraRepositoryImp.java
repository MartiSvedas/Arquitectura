package repositories;

import Interface.CarreraRepository;
import entities.Carrera;
import entities.Estudiante;

import javax.persistence.EntityManager;
import java.util.List;


public class CarreraRepositoryImp implements CarreraRepository {
    private EntityManager em;

    public CarreraRepositoryImp(EntityManager em) {
        this.em = em;
    }


    @Override
    public List<Carrera> cantidadInscriptosCarrera() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Estudiante> estudiantesPorCarrera(Carrera carrera, String ciudad) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void matricularEstudiante(Estudiante e) {

    }


    @Override
    public void insertarCarrera(Carrera c) {
        //ver chequeos de si ya existe
        this.em.getTransaction().begin();
        if(!em.contains(c)) {
            em.persist(c);
        } else {
            em.merge(c);
        }
        this.em.getTransaction().commit();

    }





}

