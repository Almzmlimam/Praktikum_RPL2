/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.almzmlimam.service;

import me.almzmlimam.model.ModelPasien;
import me.almzmlimam.repository.PasienRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Al Muzammil Imam
 */

@Service
public class PasienService {

    @Autowired
    private PasienRepository repository;

    public void addPsn(ModelPasien psn) {
        repository.save(psn);
    }

    public ModelPasien getPsn(int id) {
        return repository.findById(id).orElse(null);
    }

    public void updatePsn(ModelPasien psn) {
        repository.save(psn);
    }

    public void deletePsn(int id) {
        repository.deleteById(id);
    }

    public List<ModelPasien> getAllPasien() {
        return repository.findAll();
    }
}
