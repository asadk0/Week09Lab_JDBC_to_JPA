package database;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 759175
 */ 
public class DBUtil {
    
    private static final EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("UsersPU");
    public static EntityManagerFactory getEmFactory() {
        return emf;
    }
}