package com.cavebird.dao;

import com.cavebird.entities.Trainer;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TrainerDaoImpl implements TrainerDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Trainer> findAll() {
        Query q = getSession().createQuery("SELECT t FROM Trainers t");
        List<Trainer> list = q.getResultList();
        return list;
    }

    @Override
    public void createOrUpdate(Trainer t) {
        getSession().saveOrUpdate(t);
    }

    @Override
    public void delete(int id) {
        Trainer t = getSession().getReference(Trainer.class, id);
        getSession().delete(t);
    }

    @Override
    public Trainer findById(int id) {
        return (Trainer)getSession().get(Trainer.class, id);
    }

    @Override
    public List<Trainer> findCustomersByName(String searchName) {
        Query q = getSession().createQuery("SELECT t FROM Trainers t WHERE CONCAT(fname, ' ',lname) LIKE : name");
        q.setParameter("name", "%"+searchName+"%");
        List<Trainer> list = q.getResultList();
        return list;
    }

}
