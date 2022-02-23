package com.example.apifridgigo.Service;

public class service {
    
}


import com.example.apifridgigo.Entity.Rezepte.Rezept;
import com.example.demo.model.Rezepte;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
@Transactional
public class RezeptService {
    @Autowired
    private RezeptRepository rezeptRepository;
    public List<Rezept> listAllRezepts() {
        return rezept-Repository.findAll();
    }

    public void saveRezepts(Rezept rezept) {
        rezeptRepository.save(rezept);
    }

    public User getUser(Integer id) {
        return rezeptRepository.findById(id).get();
    }

    public void deleteUser(Integer id) {
        rezeptRepository.deleteById(id);
    }
}