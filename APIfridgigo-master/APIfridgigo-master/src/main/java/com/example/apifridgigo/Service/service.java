package com.example.apifridgigo.Service;

import com.example.apifridgigo.Repository.RezeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Transactional
public class RezeptService {

    @Autowired
    private RezeptRepository repository;

    public List<Rezept> saveRezepte(List<Rezept> rezepte){
       return repository.saveAll(rezepte);
    }

    


}