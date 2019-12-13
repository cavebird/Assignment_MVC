package com.cavebird.service;

import com.cavebird.entities.Trainer;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface TrainerService {
    
    List<Trainer> getAllTraines();
    
    public void createOrUpdateTrainer(Trainer t);
    
    public void deleteTrainer(int id);
    
    public Trainer findTrainerbyId(int id);
    
    public List<Trainer> findTrainersByName(String searchName);
    
    
}
