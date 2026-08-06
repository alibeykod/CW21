package ir.maktabsharif.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.util.function.Function;

public class HibernateUtil {
    private static EntityManagerFactory emf;

    private HibernateUtil() {
    }

    public static EntityManagerFactory getEmf() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("postgres-pu");
        }
        return emf;
    }

    public static EntityManager getEm() {
        return getEmf().createEntityManager();
    }

    public static <T> T inTxReturn(Function<EntityManager, T> operation) {
        EntityManager em = getEm();
        EntityTransaction tx = em.getTransaction();

        try (em) {
            tx.begin();
            T t = operation.apply(em);
            tx.commit();
            return t;
        } catch (Exception e) {
            tx.rollback();
            throw e;
        }
    }
}
