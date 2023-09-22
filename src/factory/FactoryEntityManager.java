package factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FactoryEntityManager {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Integrador2");
    private  EntityManager em;

   public FactoryEntityManager () {
    }

    public EntityManager getInstance() {
        if ((em == null) || (!em.isOpen())){
            //EntityManagerFactory emf = Persistence.createEntityManagerFactory("Integrador2");
            em = emf.createEntityManager();
        }
        return em;
    }
    public void closeConection(EntityManager em){
        this.emf.close();
        em.close();
    }
}
