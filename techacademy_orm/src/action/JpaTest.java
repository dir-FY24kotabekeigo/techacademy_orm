package action;

import javax.persistence.EntityManager;

import entity.City;
import util.DButil;

public class JpaTest {

    public static void main(String[] args) {
        EntityManager em = DButil.createEntityManager();

        City city = em.find(City.class, 1);
        System.out.println(city.getName());
        
        em.close();
    }

}
