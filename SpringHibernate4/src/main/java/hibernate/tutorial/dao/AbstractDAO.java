package hibernate.tutorial.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by thangnguyen-imac on 8/13/16.
 */
public abstract class AbstractDAO {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public void persist(Object object){
        this.getSession().save(object);
    }

    public void delete(Object object){
        this.getSession().delete(object);
    }

}
