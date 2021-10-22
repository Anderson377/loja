package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

    private  static final EntityManagerFactory FACTORY = Persistence
            .createEntityManagerFactory("loja"); //PesistenceUnit do arquivo persistence.xml

    public static EntityManager getEntityManager(){
        return FACTORY.createEntityManager();
    }
}
