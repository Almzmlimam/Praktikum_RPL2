/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package me.almzmlimam;

import me.almzmlimam.controller.PasienController;
import me.almzmlimam.service.PasienService;
import me.almzmlimam.view.PasienView;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Al Muzammil Imam
 */

@SpringBootApplication
public class UjianPraktikum_RPL implements ApplicationRunner {

    @Autowired
    private PasienService pasienService;

    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");

        ApplicationContext context = SpringApplication.run(UjianPraktikum_RPL.class, args);

        PasienController controller = context.getBean(PasienController.class);
        PasienView pasienView = new PasienView(controller);
        pasienView.setVisible(true);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
