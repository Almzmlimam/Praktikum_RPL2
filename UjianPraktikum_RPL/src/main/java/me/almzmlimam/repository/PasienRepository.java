/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.almzmlimam.repository;

import me.almzmlimam.model.ModelPasien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Al Muzammil Imam
 */

@Repository
public interface PasienRepository extends JpaRepository<ModelPasien, Integer> {

}
