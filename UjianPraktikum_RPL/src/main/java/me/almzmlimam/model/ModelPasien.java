/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.almzmlimam.model;

import jakarta.persistence.*;

/**
 *
 * @author Al Muzammil Imam
 */

@Entity
@Table(name = "pasien")
public class ModelPasien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nama", nullable = false, length = 55)
    private String nama;

    @Column(name = "usia")
    private int usia;

    @Column(name = "diagnosa", nullable = false, length = 55)
    private String diagnosa;

    @Column(name = "jeniskelamin", nullable = false)
    private boolean jeniskelamin; // true: Laki-laki, false: Perempuan

    @Column(name = "telepon")
    private int telepon;

    @Column(name = "alamat", nullable = false, length = 55)
    private String alamat;

    // Default constructor
    public ModelPasien() {
    }

    // Constructor tanpa telepon dan alamat
    public ModelPasien(int id, String nama, int usia, String diagnosa, boolean jeniskelamin) {
        this.id = id;
        this.nama = nama;
        this.usia = usia;
        this.diagnosa = diagnosa;
        this.jeniskelamin = jeniskelamin;
    }

    // Constructor lengkap dengan telepon dan alamat
    public ModelPasien(int id, String nama, int usia, String diagnosa, boolean jeniskelamin, int telepon, String alamat) {
        this.id = id;
        this.nama = nama;
        this.usia = usia;
        this.diagnosa = diagnosa;
        this.jeniskelamin = jeniskelamin;
        this.telepon = telepon;
        this.alamat = alamat;
    }

    // Getter dan Setter untuk id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk usia
    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    // Getter dan Setter untuk diagnosa
    public String getDiagnosa() {
        return diagnosa;
    }

    public void setDiagnosa(String diagnosa) {
        this.diagnosa = diagnosa;
    }

    // Getter dan Setter untuk jenis kelamin
    public boolean isJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(boolean jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    // Getter dan Setter untuk telepon
    public int getTelepon() {
        return telepon;
    }

    public void setTelepon(int telepon) {
        this.telepon = telepon;
    }

    // Getter dan Setter untuk alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
