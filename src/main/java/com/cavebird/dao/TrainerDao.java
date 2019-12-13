package com.cavebird.dao;

import com.cavebird.entities.Trainer;
import java.util.List;


public interface TrainerDao {
    
    List<Trainer> findAll();
    
    public void createOrUpdate(Trainer t);
    
    public void delete(int id);
    
    public Trainer findById(int id);
    
    public List<Trainer> findCustomersByName(String searchname);
    
    
}
