/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.almzmlimam.model;

import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 *
 * @author Al Muzammil Imam
 */

public class ModelTabelPasien extends AbstractTableModel {

    private List<ModelPasien> pasienList;
    private String[] columnNames = {"ID", "Nama", "Usia", "Diagnosa", "Jenis Kelamin", "No Telepon", "Alamat"};

    // Konstruktor
    public ModelTabelPasien(List<ModelPasien> pasienList) {
        this.pasienList = pasienList;
    }

    @Override
    public int getRowCount() {
        if (pasienList != null) {
            return pasienList.size(); // Pastikan pasienList tidak null
        }
        return 0;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (pasienList == null || rowIndex >= pasienList.size()) {
            return null; // Menangani jika pasienList kosong atau rowIndex tidak valid
        }

        ModelPasien pasien = pasienList.get(rowIndex); // Mendapatkan objek pasien berdasarkan rowIndex
        switch (columnIndex) {
            case 0:
                return pasien.getId();  // Mengambil ID pasien
            case 1:
                return pasien.getNama();  // Mengambil nama pasien
            case 2:
                return pasien.getUsia();  // Mengambil usia pasien
            case 3:
                return pasien.getDiagnosa();  // Mengambil diagnosa pasien
            case 4:
                return pasien.isJeniskelamin() ? "Laki-laki" : "Perempuan";  // Mengambil jenis kelamin pasien
            case 5:
                return pasien.getTelepon();  // Mengambil nomor telepon pasien
            case 6:
                return pasien.getAlamat();  // Mengambil alamat pasien
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];  // Mengambil nama kolom sesuai dengan index
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;  // Menetapkan agar sel tidak dapat diedit
    }

    // Setter untuk mengupdate pasienList dan memperbarui tabel
    public void setPasienList(List<ModelPasien> pasienList) {
        this.pasienList = pasienList;
        fireTableDataChanged();  // Menyegarkan tabel setelah data diperbarui
    }
}
