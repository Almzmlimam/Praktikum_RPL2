/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.almzmlimam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import me.almzmlimam.model.ModelPasien;
import me.almzmlimam.service.PasienService;

import java.util.List;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Al Muzammil Imam
 */

@Controller
public class PasienController {

    @Autowired
    private PasienService pasienService;

    // Add new Pasien
    public String addPasien(@RequestBody ModelPasien psn) {
        pasienService.addPsn(psn);
        return "Pasien added successfully";
    }

    // Get Pasien by ID
    public ModelPasien getPasien(@PathVariable int id) {
        return pasienService.getPsn(id);
    }

    // Update Pasien
    public String updatePasien(@RequestBody ModelPasien psn) {
        pasienService.updatePsn(psn);
        return "Pasien updated successfully";
    }

    // Delete Pasien by ID
    public String deletePasien(@PathVariable int id) {
        pasienService.deletePsn(id);
        return "Pasien deleted successfully";
    }

    // Get all Pasien
    public List<ModelPasien> getAllPasien() {
        return pasienService.getAllPasien();
    }
}
