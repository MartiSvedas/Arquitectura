import entities.Carrera;
import entities.Estudiante;
import entities.EstudianteCarrera;
import factory.FactoryEntityManager;
import repositories.CarreraRepositoryImp;
import repositories.EstudianteCarreraRepositoryImp;
import repositories.EstudianteRepositoryImp;

import javax.persistence.EntityManager;
import java.sql.Timestamp;


public class Main {
    public static void main(String[] args) {
        FactoryEntityManager FactEntity = new FactoryEntityManager();
        EntityManager em = FactEntity.getInstance();
        EstudianteRepositoryImp eri = new EstudianteRepositoryImp(em);
        CarreraRepositoryImp cri = new CarreraRepositoryImp(em);

//Agregar estudiante y carrera
        Estudiante e = new Estudiante(44, "dolo", "parral", 34, "fem", "tandil", 999999);
        eri.altaEstudiante(e);
        Carrera c = new Carrera("Tudai", 2);
        cri.insertarCarrera(c);

//Inscribir estudiante
      EstudianteCarreraRepositoryImp ecri = new EstudianteCarreraRepositoryImp(em);
        Timestamp inscrip = new Timestamp(System.currentTimeMillis());
        Timestamp grad = Timestamp.valueOf("2026-09-23 10:10:10.0");
        EstudianteCarrera estudianteCarrera = new EstudianteCarrera(e,c,inscrip,grad,0);

        ecri.matricularEstudiante(estudianteCarrera);
        FactEntity.closeConection(em);
    }
}
