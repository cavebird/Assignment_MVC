package com.cavebird.service;

import com.cavebird.dao.TrainerDao;
import com.cavebird.entities.Trainer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TrainerServiceImpl implements TrainerService{
    
    @Autowired
    TrainerDao tdao;

    @Override
    public List<Trainer> getAllTraines() {
        return tdao.findAll();
    }

    @Override
    public void createOrUpdateTrainer(Trainer t) {
        tdao.createOrUpdate(t);
    }

    @Override
    public void deleteTrainer(int id) {
        tdao.delete(id);
    }

    @Override
    public Trainer findTrainerbyId(int id) {
        return tdao.findById(id);
    }

    @Override
    public List<Trainer> findTrainersByName(String searchName) {
        List<Trainer> list = tdao.findCustomersByName(searchName);
        return list;
    }
    
}
